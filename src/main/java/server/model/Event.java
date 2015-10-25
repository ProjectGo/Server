package server.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String description;
    @Column(name = "place")
    private String place;
    @Column(name = "time")
    private String time;
    @Column(name = "groupId")
    private int groupId;
    private List<User> users;

    public Event(String newDescription, String newPlace, String newTime, int newGroupId) {
        description = newDescription;
        place = newPlace;
        time = newTime;
        groupId = newGroupId;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getPlace() {
        return place;
    }

    public String getTime() {
        return time;
    }

    public int getGroupId() {
        return groupId;
    }

    @ManyToMany(mappedBy = "events")
    public List<User> getUsers() {
        return users;
    }
}
