package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import server.dto.UserDTO;
import server.dto.VkUserDTO;
import server.vkapi.Response;
import server.vkapi.UserResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by philipp on 25.10.15.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private Api api;

    private List<VkUserDTO> getVkUsers(String token)
    {
        UserResponse response = api.getFriends(token);
        ArrayList<VkUserDTO> friends = new ArrayList<VkUserDTO>();
        for (Response u : response.getResponse()) {
            friends.add(new VkUserDTO(u.getFirstName(), u.getLastName(), "vk", u.getUserId()));
        }
        return friends;
    }

    @Override
    public List<UserDTO> getUsers(String token) {
        List<UserDTO> userDTOs = new ArrayList<UserDTO>();
        for (VkUserDTO vkUserDTO : getVkUsers(token)) {
            userDTOs.add(new UserDTO(vkUserDTO));
        }
        return userDTOs;
    }

    @Override
    public List<UserDTO> getUsers(String token, List<String> vkIds) {
//        List<UserDTO> userDTOs = new ArrayList<UserDTO>();
//        for (String vkID)
        return null;
    }

    @Override
    public List<UserDTO> getUsers(String token, int groupId) {
        GroupService groupService;

    }
}
