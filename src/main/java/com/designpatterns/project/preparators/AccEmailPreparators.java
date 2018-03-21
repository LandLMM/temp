package main.java.com.designpatterns.project.preparators;

import main.java.com.designpatterns.project.mailTemplate;

import java.awt.*;

public class AccEmailPreparators implements EmailPreparator {

    private Event event;

    public AccEmailPreparators(Event event) {

        this.event = event;
    }

    @Override
    public mailTemplate prepareAccLeaveMailTemplate() {


        mailTemplate.setTo("nowyLeaveGoogle.com");
        mailTemplate.setTo("nowyTrip@google.com");
        mailTemplate.setTo("CCnowyTrip@google.com");
        mailTemplate.setTo("Nowy email - delegacka");
        mailTemplate.setTo("Zawartosc maila dla nowego eventu - zwolnienie.");
        return mailTemplate;
    }

    private MailTemplate prepareAccTripMailTempate() {

        mailTemplate.setTo("nowyLeaveGoogle.com");
        mailTemplate.setTo("nowyTrip@google.com");
        mailTemplate.setTo("CCnowyTrip@google.com");
        mailTemplate.setTo("Nowy email - delegacka");
        mailTemplate.setTo("Zawartosc maila dla nowego eventu - delegacja.");
        return mailTemplate;
    }
}
