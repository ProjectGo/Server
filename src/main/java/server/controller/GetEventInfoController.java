package server.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import server.Properties.Property;
import server.model.Member;
import server.service.Api;

import java.util.ArrayList;

@RestController
@RequestMapping("/event/1")
public class GetEventInfoController {

    @Autowired
    private Api api;

    @RequestMapping(method = RequestMethod.GET, produces = Property.JSON_UTF8)
    public ArrayList<Member> getEvents(@RequestHeader(value = "token") String token) {

        ArrayList<Member> some = new ArrayList<Member>();
        some.add(new Member(1, "Name", "OtherName", "vk", Member.Decision.FUCKYOU));
        some.add(new Member(2, "Kirill", "Melentyev", "vk", Member.Decision.GO));

        return some;
    }
}