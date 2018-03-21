package main.java.com.designpatterns.project;

import javafx.event.Event;
import main.java.com.designpatterns.project.preparators.NewEmailPreparator;

public class emailPreparatorFactory {

    public emailPreparator getEmailPreparator(Event event) {
        if (event.getEventStatus().equals("NEW"))
            return new NewEmailPreparator(event);
        else if event.getEventStatus().equals "NEW"))
        return new AccEmailPreparator(event);
        else
        return null;
    }
}
