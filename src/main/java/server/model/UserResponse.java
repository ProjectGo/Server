package server.model;

import java.util.ArrayList;

public class UserResponse {
    public class User {
        private int id;
        private String firstName;
        private String lastName;

        public int getId() {
            return id;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }
    public int count;
    public ArrayList<User> users;
}
