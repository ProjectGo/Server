package server.model;

import server.enums.Decision;

public class Member extends User {

    private Decision decision;


    public Member(Decision newDecision) {
        decision = newDecision;
    }

    public Decision getDecision() {
        return decision;
    }
    public void setDecision(Decision decision) {
        this.decision = decision;
    }
}
