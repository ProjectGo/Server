package server.service;

import server.dto.UserDTO;

import java.util.List;

/**
 * Created by philipp on 25.10.15.
 */
public interface UserService {
    List<UserDTO> getUsers(String token);
    List<UserDTO> getUsers(String token, List<String> vkIds);
    List<UserDTO> getUsers(String token, int groupId);
}
