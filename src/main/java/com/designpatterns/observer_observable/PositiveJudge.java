package main.java.com.designpatterns.observer_observable;

public class PositiveJudge implements Observer {

    public void doAction(String dressType) {
        System.out.printf("It's a very nice " + dressType);
    }
}
