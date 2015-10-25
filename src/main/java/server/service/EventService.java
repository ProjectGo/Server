package server.service;


import server.model.Event;
import server.model.Member;

import java.util.List;

public interface EventService {
    void saveEvent(Event event);
    List<Member> findAllParticipants(int id);
    List<Event> findAllEvents(int id);
}
