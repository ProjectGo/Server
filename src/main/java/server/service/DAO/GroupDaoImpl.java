package server.service.DAO;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;
import server.service.DAO.model.GroupDBO;

import java.util.List;

/**
 * Created by philipp on 25.10.15.
 */

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
}
