package exercise1.observer;

public class Viewer implements Observer {

    private String name;
    private Observable athlete;

    public Viewer(String name) {
        this.setName(name);
    }

    @Override
    public void update() {
        if (athlete == null) {
            System.out.println("No athlete");
            return;
        }

        String exercise = athlete.getUpdate();
        System.out.println(this.getName() + " updated with: " + "Exercise is: " + exercise);
    }

    @Override
    public void setAthlete(Observable athlete) {
        this.athlete = athlete;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
