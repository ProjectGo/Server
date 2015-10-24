package server.model;

public class Member extends User {
    public enum Decision {GO, FUCKYOU, NOIDEA}

    private Decision decision;

    public Member(int newId, String newFirstName, String newLastName, String newService, Decision newDecision) {
        super(newId, newFirstName, newLastName, newService);
        decision = newDecision;
    }

    public Decision getDecision() {
        return decision;
    }
}
