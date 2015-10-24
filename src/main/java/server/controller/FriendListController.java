package server.controller;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.media.jfxmedia.Media;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.Properties.Property;
import server.model.User;
import server.service.Api;
import server.service.ApiImpl;
import server.vkapi.Response;
import server.vkapi.UserResponse;

import java.net.ResponseCache;
import java.util.ArrayList;
import java.util.List;

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
