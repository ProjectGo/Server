package server.service.DAO;

import server.model.Event;
import server.model.Member;

import java.util.List;

public interface EventDao {
    void saveEvent(Event event);
    List<Event> findAllEvents(int id);
    List<Member> findAllParticipants(int eventId);
}
