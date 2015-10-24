package server.service;

import server.vkapi.UserResponse;

/**
 * Created by philipp on 24.10.15.
 */
public interface Api {
    String getAccessToken(String code);
    UserResponse getFriends(String token);
}
