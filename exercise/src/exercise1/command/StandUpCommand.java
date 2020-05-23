package exercise1.command;

public class StandUpCommand implements Command {
    private Exercise exercise;

    public StandUpCommand(Exercise exercise) {
        this.exercise = exercise;
    }

    @Override
    public String execute() {
        return this.exercise.standUp();
    }
}
