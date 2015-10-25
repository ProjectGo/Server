package server.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Events")
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
    @ManyToMany(mappedBy = "events")
    private Set<User> users = new HashSet<User>(0);

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


//    @ManyToMany
//    @JoinTable(name = "People2Events", joinColumns = {
//            @JoinColumn(name = "eventId", nullable = false, updatable = false, referencedColumnName = "id") },
//            inverseJoinColumns = { @JoinColumn(name = "userId",
//                    nullable = false, updatable = false, referencedColumnName = "id") })
    public Set<User> getUsers() {
        return users;
    }
}
