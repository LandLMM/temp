package main.java.com.designpatterns.wrapper;

import java.sql.Connection;

public class wrapperConnection {
    private Connection connection;

    public wrapperConnection(Connection connection) {
        this.connection = connection;
    }


    public void connect() {
        connection.establishConnection();
    }

    private void validate() {
        System.out.println("Perform validation");
    }
}
