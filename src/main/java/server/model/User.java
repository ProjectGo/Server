package server.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Users", catalog = "postgres", schema = "public")
public class User {

    private int id;

    private String vkId;

    private Set<Event> events = new HashSet<Event>(0);

    public User() {}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }
    @Column(name = "vkid")
    public String getVkId() {

        return vkId;
    }

    @ManyToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    @JoinTable(name = "People2Events", joinColumns = {
            @JoinColumn(name = "userId", nullable = false, updatable = false, referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "eventId",
                    nullable = false, updatable = false, referencedColumnName = "id") })
    public Set<Event> getEvents() {
        return events;
    }

    public void setVkId(String vkId) {
        this.vkId = vkId;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }
}
