package ua.gfg.javarush.GitLabTest.BusinessValue;

import ua.gfg.javarush.GitLabTest.Bean.Event;

public class PrintEventList {
    public static void printEventList() {
        for (Event event : Event.eventList) {
            System.out.println(event.toString());
        }
    }
}
