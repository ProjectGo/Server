package server.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "vkid")
    private String vkId;
    private List<Event> events;

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

    @ManyToMany
    @JoinTable(name = "People2Events", joinColumns = {
        @JoinColumn(name = "userId", nullable = false, updatable = false) },
    inverseJoinColumns = { @JoinColumn(name = "eventId",
            nullable = false, updatable = false) })
    public List<Event> getEvents() {
        return events;
    }

}
