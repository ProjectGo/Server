package server.dto;

import server.enums.Decision;

/**
 * Created by philipp on 25.10.15.
 */
public class UserMemberDTO extends UserDTO {
    private Decision decision;

    public Decision getDecision() {
        return decision;
    }

    public void setDecision(Decision decision) {
        this.decision = decision;
    }
}
