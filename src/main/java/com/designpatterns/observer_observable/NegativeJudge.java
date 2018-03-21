package main.java.com.designpatterns.observer_observable;

public class NegativeJudge implements Observer {

    @Override
    public void doAction() {
        System.out.println("Very poor performance !");
    }

    @Override
    public void doAction(String dressType) {

    }
}
