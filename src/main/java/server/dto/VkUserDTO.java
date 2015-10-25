package server.dto;

/**
 * Created by philipp on 25.10.15.
 */
public class VkUserDTO extends BaseUserDTO {
    private long vkUserId;

    public VkUserDTO(String firsName, String lastName, String service, long vkUserId) {
        super(firsName, lastName, service);
        this.vkUserId = vkUserId;
    }

    public long getVkUserId() {
        return vkUserId;
    }

    public void setVkUserId(long vkUserId) {
        this.vkUserId = vkUserId;
    }
}
