package server.service;

import org.springframework.stereotype.Component;
import server.model.Event;
import server.model.Member;

import java.util.List;

@Component
public class EventServiceImpl implements EventService {
    @Override
    public void saveEvent(Event event) {

    }

    @Override
    public List<Member> findAllParticipants(int id) {
        return null;
    }

    @Override
    public List<Event> findAllEvents(int id) {
        return null;
    }

    @Override
    public void findAllEvents() {

    }
}
