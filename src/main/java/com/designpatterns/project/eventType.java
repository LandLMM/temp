package main.java.com.designpatterns.project;

public class eventType {


public static String LEAVE = "LEAVE";
public static String


    private String eventType; //LEAVE, TRIP

    private String eventStatus; // NEW, ACC, REJ

    public String getEventType() {
        return eventType;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }
}
