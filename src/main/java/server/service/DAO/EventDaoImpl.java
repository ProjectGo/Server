package server.service.DAO;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import server.model.Event;
import server.model.Member;
import server.service.DAO.model.GroupDBO;

import java.util.List;

@Repository
public class EventDaoImpl extends AbstractDao implements EventDao {
    public void saveEvent(Event event) {
        persist(event);
    }

    @SuppressWarnings("unchecked")
    public List<Member> findAllParticipants(int eventId) {
        Criteria criteria = getSession().createCriteria(Member.class);
        criteria.add(Restrictions.eq("event", eventId));
        return criteria.list();
    }

    @Override
    public List<Event> findAllEvents(int id) {
        Criteria criteria = getSession().createCriteria(Event.class);
        criteria.add(Restrictions.eq("id", id));
        return  (List<Event>)criteria.list();
    }
}