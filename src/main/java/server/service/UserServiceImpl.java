package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import server.dto.EventDTO;
import server.dto.UserDTO;
import server.dto.VkUserDTO;
import server.model.Event;
import server.model.User;
import server.service.DAO.UserDaoImpl;
import server.vkapi.Response;
import server.vkapi.UserResponse;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private Api api;

    @Autowired
    private UserDaoImpl userDao;

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
        Map<Long, VkUserDTO> userMap = new HashMap<Long, VkUserDTO>();
        for (VkUserDTO vkUserDTO : getVkUsers(token)) {
            userMap.put(vkUserDTO.getVkUserId(), vkUserDTO);
        }
        List<User> users = userDao.getUsersByVkId(userMap.keySet());

        for (User user: users) {
            UserDTO resultUser = new UserDTO(userMap.get(user.getVkId()));
            resultUser.setId(user.getId());
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
        return null;
    }

    public List<EventDTO> getUserEvents(int id) {
        List<EventDTO> events = new ArrayList<EventDTO>();
        User user = userDao.getUser(id);
        for (Event event: user.getEvents()) {
            EventDTO resultEvent = new EventDTO();
            resultEvent.setId(event.getId());
            resultEvent.setGroupId(event.getGroupId());
            resultEvent.setDescription(event.getDescription());
            resultEvent.setPlace(event.getPlace());
            resultEvent.setTime(event.getTime());
            events.add(resultEvent);
        }
        return events;
    }
}
