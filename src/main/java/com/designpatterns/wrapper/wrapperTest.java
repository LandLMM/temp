package main.java.com.designpatterns.wrapper;

import java.sql.Connection;

public class wrapperTest {


    public static void main(String[] args) {
        Connection connection = new Connection("10.112.122.32") {
            wrapperConnection wrapperConnection = new wrapperConnection(connection);
            wrapperConnection.connect();
        }
    }
}
