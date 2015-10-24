package server.service;

import java.util.List;

/**
 * Created by philipp on 24.10.15.
 */
public interface Api {
    String getAccessToken(String code);
    List<Object> getFriends();
}
