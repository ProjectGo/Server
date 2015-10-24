package server.service.DAO;

import server.model.Group;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by philipp on 25.10.15.
 */
public class DAOImpl {
    private static final String url = "jdbc:postgresql://127.0.0.1:5432/projectgo";
    private static final String user = "adminrwemvdf";
    private static final String password = "Qa2yQiqIsWBj";

    private Connection connection;

    public DAOImpl() {
        try {

            connection = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Group> getGroups(int personId) {
        return null;
    }

    public void closeConnection() {
        try {
            connection.close();
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
