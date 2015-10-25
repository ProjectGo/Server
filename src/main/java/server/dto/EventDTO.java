package server.dto;

import server.model.Event;
import server.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by philipp on 25.10.15.
 */
public class EventDTO {

    private int id;
    private String description;
    private String place;
    private String time;
    private int groupId;
    private List<UserDTO> users;

    public EventDTO() {

    }

    public EventDTO(String newDescription, String newPlace, String newTime, int newGroupId) {
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

    public List<UserDTO> getUsers() {
        return users;
    }

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

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }
}