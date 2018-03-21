package main.java.com.designpatterns.project.preparators;

import main.java.com.designpatterns.project.emailPreparator;
import main.java.com.designpatterns.project.mailTemplate;

import java.awt.*;

public class NewEmailPreparator implements emailPreparator {

    this.event = event;

    public NewEmailPreparator() {

    }

    @Override
    public mailTemplate prepareMail() {
        if (event.getEventType().equals(Event.LEAVE)) ;
        return prepareNewLeaveMailTemplate();
        return prepareNewTripLeaveMailTemplate();

        private MailTemplate prepareNewLeaveMailTemplate () {
            MailTemplate mailTemplate = new MailTemplate();

            mailTemplate.setTo("nowyLeaveGoogle.com");
            mailTemplate.setTo("nowyTrip@google.com");
            mailTemplate.setTo("CCnowyTrip@google.com");
            mailTemplate.setTo("Nowy email - delegacka");
            mailTemplate.setTo("Zawartosc maila dla nowego eventu - delegacja.");
            return mailTemplate;
        }
    }
}