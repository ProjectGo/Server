package server.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.Properties.Property;
import server.model.Event;
import server.service.Api;

import java.util.ArrayList;

@RestController
@RequestMapping("/event")
public class MakeEventController {

    @Autowired
    private Api api;

    @RequestMapping(method = RequestMethod.POST)
    public void getEvents(@RequestHeader(value = "token") String token) {

        Event newEvent = new Event("OloloEvent", "Dumskaya", "12.12.2012", 1);

        //add to base
    }
}