package server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import server.model.Group;
import server.service.DAO.GroupDao;

import java.util.List;

/**
 * Created by philipp on 25.10.15.
 */
@Service("groupService")
@Transactional
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupDao dao;

    public void saveGroup(Group group) {
        dao.saveGroup(group);
    }

    public List<Group> findAllGroups() {
        return dao.findAllGroups();
    }
}
