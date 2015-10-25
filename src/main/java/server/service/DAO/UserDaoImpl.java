package server.service.DAO;


import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import server.model.Group;
import server.model.User;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Repository
@org.springframework.transaction.annotation.Transactional(propagation = Propagation.REQUIRES_NEW)
public class UserDaoImpl extends AbstractDao {
    public List<User> getUsersByVkId(Collection<String> users) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.in("vkId", users));
        return (List<User>)criteria.list();

    }

    public User getUser(int id) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("id", id));
        return (User)criteria.uniqueResult();
    }
}
