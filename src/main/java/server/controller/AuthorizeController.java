package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import server.service.Api;
import server.service.ApiImpl;

/**
 * Created by philipp on 24.10.15.
 */

@RestController
@RequestMapping(value = "/authorize")
public class AuthorizeController {

//    @Autowired
    public Api api = new ApiImpl();

    @RequestMapping(method = RequestMethod.POST)
    public String autorize(@RequestParam(value = "code", required = true) String code) {
        return api.getAccessToken(code);
    }

}
