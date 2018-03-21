package main.java.com.designpatterns.builder;

public class Car {

    private String name = "Audi";

    private String type = "A4";

    double engine = 2.0;

    boolean accident_free = true;

    String countryOfOrigin = "Germany";

    public enum Fuel {
        DIESEL, GASOLINE
    }

    public Car(String name, String type, double engine, boolean accident_free, String countryOfOrigin) {
        this.name = name;
        this.type = type;
        this.engine = engine;
        this.accident_free = accident_free;
        this.countryOfOrigin = countryOfOrigin;
    }

    public static class Builder {
        private String name;
        private String type;
        private double engine;
        private boolean accident_free;
        private String countryOfOrigin;

        private enum Fuel {

        }

        ;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder engine(double engine) {
            this.engine = engine;
            return this;
        }

        public Builder accident_free(boolean accident_free) {
            this.accident_free = accident_free;
            return this;
        }

        public Builder countryOfOrigin(String countryOfOrigin) {
            this.countryOfOrigin = countryOfOrigin;
            return this;
        }

        public Car build() {

        }

        private Car(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
            this.engine = builder.engine;
            this.accident_free = builder.accident_free;
            this.countryOfOrigin = builder.countryOfOrigin;
            this.Fuel = builder.Fuel;
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    ", engine=" + engine +
                    ", accident_free=" + accident_free +
                    ", countryOfOrigin='" + countryOfOrigin + '\'' +
                    '}';
        }
    }
}
