package server.controller;

import org.springframework.web.bind.annotation.RestController;

package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.Properties.Property;
import server.model.Event;
import server.model.Group;
import server.model.User;
import server.service.Api;
import server.vkapi.Response;
import server.vkapi.UserResponse;

import java.util.ArrayList;

@RestController
@RequestMapping("/event/1")
public class GetEventInfoController {

    @Autowired
    private Api api;

    @RequestMapping(method = RequestMethod.GET, produces = Property.JSON_UTF8)
    public Event getEvents(@RequestHeader(value = "token") String token) {

        Event event = Event();
        ArrayList<User> lonely = new ArrayList<User>();
        lonely.add(new User(1, "Name", "OtherName", "vk"));
        events.add(new Event("OloloEvent", "Dumskaya", "12.12.2012", 1));

        return event;
    }
}