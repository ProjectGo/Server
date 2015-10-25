package server.service.DAO;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import server.model.Group;
import server.service.DAO.model.GroupDBO;

import java.util.List;

@Repository
public class GroupDaoImpl extends AbstractDao implements GroupDao {
    public void saveGroup(GroupDBO groupDBO) {
        persist(groupDBO);
    }

    @SuppressWarnings("unchecked")
    public List<GroupDBO> findAllGroups() {
        Criteria criteria =  getSession().createCriteria(GroupDBO.class);

        return (List<GroupDBO>) criteria.list();
    }

    public Group getGroupInfo(int id) {
        Criteria criteria = getSession().createCriteria(GroupDBO.class);
        criteria.add(Restrictions.eq("id", id));
        return (Group)criteria;
    }
}
