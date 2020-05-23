package exercise1;

import exercise1.command.Coach;
import exercise1.command.Command;
import exercise1.command.Exercise;
import exercise1.command.LieDownCommand;
import exercise1.command.StandUpCommand;
import exercise1.observer.Athlete;
import exercise1.observer.Viewer;

public class Main {
    public static void main(String[] args) {
        Coach coach = new Coach();
        Exercise exercise = new Exercise();
        Command standUpCommand = new StandUpCommand(exercise);
        Command lieDownCommand = new LieDownCommand(exercise);

        Athlete athlete = new Athlete();
        Viewer viewer1 = new Viewer("Viewer 1");
        Viewer viewer2 = new Viewer("Viewer 2");
        Viewer viewer3 = new Viewer("Viewer 2");

        athlete.subscribe(viewer1);
        athlete.subscribe(viewer2);
        athlete.subscribe(viewer3);

        coach.setCommand(standUpCommand);
        athlete.doExercise(coach.sayExercise());

        coach.setCommand(lieDownCommand);
        athlete.doExercise(coach.sayExercise());
    }
}
