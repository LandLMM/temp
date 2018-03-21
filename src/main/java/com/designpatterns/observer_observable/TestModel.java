package main.java.com.designpatterns.observer_observable;

public class TestModel {

    public static void main(String[] args) {
        Model model = new Model();
        model.addObserver(new Observer() {
            @Override
            public void doAction(String dressType) {
                System.out.println("Bez szalu");
            }
        });
        model.addObserver(new PositiveJudge());
        model.changeDress("sukienka");
    }
}
