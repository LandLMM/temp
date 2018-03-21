package main.java.com.designpatterns.observer_observable;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private List<Observer> observers;


    public Model() {
        observers = new ArrayList<>();
        observers.add(new NegativeJudge());
        observers.add(new NeutralJudge());
        observers.add(new PositiveJudge());
    }

    public void changeDress(String dress) {
        System.out.println("New dress :" + dress);
        observers.forEach(o -> doAction());
    }

    public void addObserver(Observer o) {

        observers.add(o);
    }
}
