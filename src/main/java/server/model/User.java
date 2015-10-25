package server.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "vkid")
    private String vkId;
    @ManyToMany
    @JoinTable(name = "People2Events", joinColumns = {
            @JoinColumn(name = "userId", nullable = false, updatable = false, referencedColumnName = "id") },
            inverseJoinColumns = { @JoinColumn(name = "eventId",
                    nullable = false, updatable = false, referencedColumnName = "id") })
    private Set<Event> events = new HashSet<Event>(0);

    public User() {}

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getVkId() {

        return vkId;
    }


    public Set<Event> getEvents() {
        return events;
    }

}
