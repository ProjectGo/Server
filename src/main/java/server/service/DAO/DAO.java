package server.service.DAO;

import server.model.Group;
import server.model.User;

import java.util.List;

public interface DAO {
    String getGroups();
    String getGroup(int groupId);
    String makeGroup(String groupName, List<User> participants);
    String getEvents();
    String getEvent(int eventId);
    String makeEvent(String description, String place, String time, Group groupId);

}
