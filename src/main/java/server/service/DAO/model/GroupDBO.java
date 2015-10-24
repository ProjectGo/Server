package server.service.DAO.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by philipp on 25.10.15.
 */

@Entity
@Table(name = "GroupDBO")
public class GroupDBO implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    public GroupDBO() {

    }

    public GroupDBO(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
