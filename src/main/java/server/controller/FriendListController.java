package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.model.User;
import server.model.UserResponse;
import server.service.Api;
import server.service.ApiImpl;

import java.net.ResponseCache;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class FriendListController {

    @Autowired
    private Api api;

    @RequestMapping(method = RequestMethod.GET)
    public String getFriendList(@RequestHeader(value = "token") String token) {
        UserResponse response = api.getFriends(token);
        ArrayList<User> friends = new ArrayList<User>();
        for (UserResponse.User u: response.users) {
            friends.add(new User(u.getId(), u.getFirstName(), u.getLastName(), "vk"));
        }
        return friends.toString();
    }

}
