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

import java.util.ArrayList;

@RestController
@RequestMapping("/group/1")
public class GetGroupInfoController {

    @Autowired
    private Api api;


    @RequestMapping(method = RequestMethod.GET, produces = Property.JSON_UTF8)
    public Group getGroupInfo(@RequestHeader(value = "token") String token) {

        return null;
    }
}

