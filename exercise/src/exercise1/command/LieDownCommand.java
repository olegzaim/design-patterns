package exercise1.command;

public class LieDownCommand implements Command {
    private Exercise exercise;

    public LieDownCommand(Exercise exercise) {
        this.exercise = exercise;
    }

    @Override
    public String execute() {
        return this.exercise.lieDown();
    }
}
