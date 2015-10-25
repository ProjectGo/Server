package server.model;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String service;
    private List<Event> events;

    public User() {}

    public User(int newId, String newFirstName, String newLastName, String newService) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        service = newService;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getService() {
        return service;
    }

    @ManyToMany
    @JoinTable(name = "People2Events", joinColumns = {
        @JoinColumn(name = "userId", nullable = false, updatable = false) },
    inverseJoinColumns = { @JoinColumn(name = "eventId",
            nullable = false, updatable = false) })
    public List<Event> getEvents() {
        return events;
    }

}
