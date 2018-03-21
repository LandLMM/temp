package main.java.com.designpatterns.wrapper;

public class connecton {


    private String databaseAddress;

    public connecton(String databaseAddress) {
        this.databaseAddress = databaseAddress;
    }

    public void etablishConnection() {


        System.out.println("Establish connection with " + databaseAddress);
    }
}
