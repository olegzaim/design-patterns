package observer;

import java.util.ArrayList;
import java.util.List;

public class Athlete implements Observable {
    private List<Observer> observers = new ArrayList<Observer>();
    private String exercise;

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setAthlete(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    @Override
    public String getUpdate() {
        return this.exercise;
    }

    public String getExercise() {
        return exercise;
    }

    public void doExercise(String exercise) {
        this.exercise = exercise;
        this.notifyObservers();
    }

}
