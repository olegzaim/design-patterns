import command.Coach;
import command.Command;
import command.Exercise;
import command.LieDownCommand;
import command.StandUpCommand;
import observer.Athlete;
import observer.Viewer;

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
        athlete.setExercise(coach.sayExercise());

        coach.setCommand(lieDownCommand);
        athlete.setExercise(coach.sayExercise());
    }
}
