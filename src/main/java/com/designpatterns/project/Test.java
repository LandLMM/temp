package main.java.com.designpatterns.project;

import main.java.com.designpatterns.project.preparators.NewEmailPreparator;

public class Test {

    public static void main(String[] args) {
        Event event = new Event();
        event.setEventType("LEAVE");
        event.setEventStatus("ACC");
        EmailPreparatorFactory factory = new NewEmailPreparator();
        mailTemplate mailTemplate = new emailPreparator().prepareMail();
        System.out.println(mailTemplate);

    }
}
