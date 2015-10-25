package server.service.DAO;

import server.model.Group;
import server.service.DAO.model.GroupDBO;

import java.util.List;

/**
 * Created by philipp on 25.10.15.
 */
public interface GroupDao {
    void saveGroup(GroupDBO group);
    List<GroupDBO> findAllGroups();
    Group getGroupInfo(int id);
}
