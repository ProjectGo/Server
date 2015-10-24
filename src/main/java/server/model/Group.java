package server.model;

import java.util.List;

public class Group {
    private String name;
    private List<User> participants;

    public Group(String newName, List<User> newParticipants) {
        name = newName;
        participants = newParticipants;
    }
    public String getName() {
        return name;
    }

    public List<User> getParticipants() {
        return participants;
    }
}
