package main.java.com.designpatterns.builder;

public class Person {

    private String name;

    private String surname;

    private int height;

    private int weight;

    private String pesel;

    private int age;

    public Person(String name, String surname, int height, int weight, String pesel, int age) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.weight = weight;
        this.pesel = pesel;
        this.age = age;
    }

    public static class Builder {
        //required
        private String name;
        private String pesel;
        //optional
        private String surname = "Surname";
        private int height = 100;
        private int weight;
        private int age;

        public Builder(String name, String pesel) {
            this.name = name;
            this.pesel = pesel;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder height(int height) {
            this.height = height;
            return this;
        }

        public Builder weight(int weight) {
            this.height = height;
            return this;
        }

        public Builder pesel(String pesel) {
            this.pesel = pesel;
            return this;
        }
    }


    public Person build() {

        return new Person(this);
    }

    private Person(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.height = builder.height;
        this.weight = builder.weight;
        this.surname = builder.surname;
        this.pesel = builder.pesel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", pesel='" + pesel + '\'' +
                ", age=" + age +
                '}';
    }
}
