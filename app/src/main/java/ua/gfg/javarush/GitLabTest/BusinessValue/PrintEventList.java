package ua.gfg.javarush.GitLabTest.BusinessValue;

import java.util.Collections;

import ua.gfg.javarush.GitLabTest.Bean.Event;

public class PrintEventList {
    public static void printEventList() {

        Collections.sort(Event.eventList);
        Collections.reverse(Event.eventList);

        for (Event event : Event.eventList) {
            System.out.println(event.toString());
        }
    }
}
