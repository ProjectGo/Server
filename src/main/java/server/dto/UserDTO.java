package server.dto;

/**
 * Created by philipp on 25.10.15.
 */
public class UserDTO extends BaseUserDTO {
    private int id;


    public UserDTO(int id, String firsName, String lastName, String service) {
        this(firsName, lastName, service);
        this.id = id;
    }

    public UserDTO(BaseUserDTO baseUserDTO) {
        super(baseUserDTO.getFirsName(), baseUserDTO.getLastName(), baseUserDTO.getService());
    }

    public UserDTO(String firsName, String lastName, String service) {
        super(firsName, lastName, service);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
