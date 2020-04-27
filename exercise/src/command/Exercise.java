package command;

public class Exercise {

    private Boolean isStandUp;

    public String standUp() {
        isStandUp = true;
        return "Stand up";
    }

    public String lieDown() {
        isStandUp = false;
        return "Lie Down";
    }
}
