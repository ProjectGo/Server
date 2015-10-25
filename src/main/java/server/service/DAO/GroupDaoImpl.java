package server.service.DAO;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import server.model.Group;

import java.util.List;

@Repository
public class GroupDaoImpl extends AbstractDao implements GroupDao {
    public void saveGroup(Group group) {
        persist(group);
    }

    @SuppressWarnings("unchecked")
    public List<Group> findAllGroups() {
        Criteria criteria =  getSession().createCriteria(Group.class);
        return (List<Group>) criteria.list();
    }
}
