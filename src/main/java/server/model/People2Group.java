package server.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by philipp on 25.10.15.
 */

//@Entity
//@Table(name = "People2Groups")
public class People2Group {
    private int groupId;
    private User user;

    @ManyToOne
    @JoinColumn(name = "id")
    public int getGroupId() {
        return groupId;
    }


    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }


    @ManyToOne
    @JoinColumn(name="id")
    public User getUserId() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }
}
