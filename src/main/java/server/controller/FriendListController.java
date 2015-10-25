package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.Properties.Property;
import server.dto.UserDTO;
import server.service.Api;
import server.vkapi.Response;
import server.vkapi.UserResponse;

import java.util.ArrayList;

@RestController
@RequestMapping("/friends")
public class FriendListController {

    @Autowired
    private Api api;


    @RequestMapping(method = RequestMethod.GET, produces = Property.JSON_UTF8)
    public ArrayList<UserDTO> getFriendList(@RequestHeader(value = "token") String token) {
        UserResponse response = api.getFriends(token);
        ArrayList<UserDTO> friends = new ArrayList<UserDTO>();
        for (Response u: response.getResponse()) {
            friends.add(new UserDTO(u.getUserId(), u.getFirstName(), u.getLastName(), "vk"));
        }
        return friends;
    }
}
