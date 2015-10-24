package server.model;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String service;

    public User() {}

    public User(int newId, String newFirstName, String newLastName, String newService) {
        id = newId;
        firstName = newFirstName;
        lastName = newLastName;
        service = newService;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getService() {
        return service;
    }

}
