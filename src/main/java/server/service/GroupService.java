package server.service;

import server.model.Group;
import server.service.DAO.model.GroupDBO;

import java.util.List;


public interface GroupService {

    void saveGroup(GroupDBO Group);
    List<GroupDBO> findAllGroups(int id);
    Group getGroupInfo(int id);

}