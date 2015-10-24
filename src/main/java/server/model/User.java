package server.model;

import java.io.Serializable;

public class User {
    public int id;
    public String firstName;
    public String lastName;
    public String service;

    public User(int newId, String newFirstName, String newLastName, String newService) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        service = newService;
    }
}
