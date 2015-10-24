package server.service;

import server.model.User;
import server.vkapi.UserResponse;

import java.util.List;

/**
 * Created by philipp on 24.10.15.
 */
public interface Api {
    String getAccessToken(String code);
    UserResponse getFriends(String token);
}
