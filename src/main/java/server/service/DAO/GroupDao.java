package server.service.DAO;

import server.model.Group;

import java.util.List;

/**
 * Created by philipp on 25.10.15.
 */
public interface GroupDao {
    void saveGroup(Group group);
    List<Group> findAllGroups();

}
