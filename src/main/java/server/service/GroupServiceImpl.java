package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import server.model.Group;
import server.service.DAO.GroupDao;
import server.service.DAO.model.GroupDBO;

import java.util.List;


@Service("groupService")
@Transactional
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDao dao;

    public void saveGroup(GroupDBO group) {
        dao.saveGroup(group);
    }

    public List<GroupDBO> findAllGroups(int id) {
        return dao.findAllGroups();
    }

    public Group getGroupInfo(int id) {
        return dao.getGroupInfo(id);
    }
}
