package server.model;

public class Event {
    private String description;
    private String place;
    private String time;
    private int groupId;

    public Event(String newDescription, String newPlace, String newTime, int newGroupId) {
        description = newDescription;
        place = newPlace;
        time = newTime;
        groupId = newGroupId;
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
}
