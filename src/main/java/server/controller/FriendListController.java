package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.Properties.Property;
import server.dto.UserDTO;
import server.service.Api;
import server.service.UserService;
import server.vkapi.Response;
import server.vkapi.UserResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/friends")
public class FriendListController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, produces = Property.JSON_UTF8)
    public List<UserDTO> getFriendList(@RequestHeader(value = "token") String token) {
        return userService.getUsers(token);
    }

}
