package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.service.Api;
import server.service.ApiImpl;

@RestController
@RequestMapping("/")
public class FriendListController {

    @Autowired
    private Api api;

    @RequestMapping(method = RequestMethod.GET)
    public String getFriendList(@RequestHeader(value = "token") String token) {
        return api.getFriends(token);
    }

}
