package main.java.com.designpatterns.builder;

public class Test {

    public static void main(String[] args) {

        Person person = new Person.Builder("Marcin", 80091615065).build();
        Person person1 = new Person.Builder("Peter", 85092215034).build();
        System.out.println(person);
        System.out.println(person1);
    }


}
