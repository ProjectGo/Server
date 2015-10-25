package server.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import server.Properties.Property;
import server.model.Event;
import server.service.EventService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private EventService eventService;

    @RequestMapping(value = "/{userId}/events", method = RequestMethod.GET, produces = Property.JSON_UTF8)
    public List<Event> getEventsByUser(@PathVariable ("userId") int id) {

        return eventService.findAllEvents(id);
    }
}