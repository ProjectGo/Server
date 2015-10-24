package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.Properties.Property;
import server.model.User;
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
    public ArrayList<User> getFriendList(@RequestHeader(value = "token") String token) {
        UserResponse response = api.getFriends(token);
        ArrayList<User> friends = new ArrayList<User>();
        for (Response u: response.getResponse()) {
            friends.add(new User(u.getUserId(), u.getFirstName(), u.getLastName(), "vk"));
        }
        return friends;
    }
}
