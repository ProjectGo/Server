package server.dto;

/**
 * Created by philipp on 25.10.15.
 */
public class BaseUserDTO {
    private String firsName;
    private String lastName;
    private String service;

    public BaseUserDTO() {}

    public BaseUserDTO(String firsName, String lastName, String service) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.service = service;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
