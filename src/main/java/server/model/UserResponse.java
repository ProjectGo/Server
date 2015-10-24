package server.model;

import java.util.ArrayList;

public class UserResponse {
    public class User {
        public int id;
        public String firstName;
        public String lastName;
    }
    public int count;
    public ArrayList<User> users;
}
