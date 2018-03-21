package main.java.com.designpatterns.observer_observable;

public class NeutralJudge implements Observer {

    @Override
    public void doAction(String dressType) {
        System.out.println("It's OK " + dressType);
    }
}
