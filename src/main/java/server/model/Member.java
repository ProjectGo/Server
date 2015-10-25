package server.model;

import server.enums.Decision;

import javax.persistence.*;

//@Entity
//@Table(name = "People2Event")
public class Member {

    private Event event;
    private User user;
    private Decision decision;

    @ManyToOne
    @JoinColumn(name="id")
    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @ManyToOne
    @JoinColumn(name="id")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Column(name = "desigion")
    public Decision getDecision() {
        return decision;
    }

    public void setDecision(Decision decision) {
        this.decision = decision;
    }
}
