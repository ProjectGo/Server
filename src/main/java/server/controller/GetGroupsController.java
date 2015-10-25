package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.Properties.Property;
import server.model.Group;
import server.model.User;
import server.service.Api;
import server.service.GroupService;

import java.util.ArrayList;

@RestController
@RequestMapping("/groups")
public class GetGroupsController {

    @Autowired
    private Api api;

    @Autowired
    private GroupService service;

    @RequestMapping(method = RequestMethod.GET, produces = Property.JSON_UTF8)
    public ArrayList<Group> getGroups(@RequestHeader(value = "token") String token) {

        return null;
    }
}
