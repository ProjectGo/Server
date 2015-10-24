package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import server.service.GroupService;

@RestController
@RequestMapping("/")
public class HelloWorldController {
    @Autowired
    private GroupService service;

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "welcome";
    }

}