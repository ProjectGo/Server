package server.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Events")
public class Event {


    private int id;
    private String description;
    private String place;
    private String time;
    private int groupId;
    @JoinTable(name = "People2Events", joinColumns = {
            @JoinColumn(name = "eventId", nullable = false, updatable = false, referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "userId",
                    nullable = false, updatable = false, referencedColumnName = "id") })
    private Set<User> users = new HashSet<User>(0);

    public Event() {
    }

    public Event(String newDescription, String newPlace, String newTime, int newGroupId) {
        description = newDescription;
        place = newPlace;
        time = newTime;
        groupId = newGroupId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }
    @Column(name = "name")
    public String getDescription() {
        return description;
    }
    @Column(name = "place")
    public String getPlace() {
        return place;
    }
    @Column(name = "time")
    public String getTime() {
        return time;
    }
    @Column(name = "groupId")
    public int getGroupId() {
        return groupId;
    }


//    @ManyToMany
//    @JoinTable(name = "People2Events", joinColumns = {
//            @JoinColumn(name = "eventId", nullable = false, updatable = false, referencedColumnName = "id") },
//            inverseJoinColumns = { @JoinColumn(name = "userId",
//                    nullable = false, updatable = false, referencedColumnName = "id") })
//    @ManyToMany(mappedBy = "events", fetch = FetchType.LAZY)
//    public Set<User> getUsers() {
//        return users;
//    }
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }


}
