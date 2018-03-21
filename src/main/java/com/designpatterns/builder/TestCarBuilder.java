package main.java.com.designpatterns.builder;

import static main.java.com.designpatterns.builder.Car.Fuel.DIESEL;

public class TestCarBuilder {
    public static void main(String[] args) {

        Car car = new Car.Builder("Audi", "A4", 2.0, DIESEL, true, "Germany").build();
    }
}