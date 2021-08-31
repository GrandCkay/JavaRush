package ua.gfg.javarush.GitLabTest.BusinessValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

import ua.gfg.javarush.GitLabTest.Bean.*;

public class CreateNewEvent {
    private static BufferedReader readerCreateEvent = new BufferedReader(new InputStreamReader(System.in));

    public static void createNewEvent() throws IOException {
        System.out.println("Введіть назву івенту:");
        String nameEvent = readerCreateEvent.readLine();

        System.out.println("Введіть дату івенту в форматі дд.мм.рррр");
        String dateString = readerCreateEvent.readLine();

        System.out.println("Введіть вартість квитка:");
        int price = StringAdapter.stringAdapter(readerCreateEvent.readLine(), readerCreateEvent);

        System.out.println("Введіть кількість доступних квитків:");
        int quantity = StringAdapter.stringAdapter(readerCreateEvent.readLine(), readerCreateEvent);

        Event event = new Event(nameEvent, dateString, price, quantity);

        try {
            event.setDate();
            Event.eventList.add(event);
            System.out.println("Івент створено.");
        } catch (ParseException e) {
            System.out.println("Дата введена не вірно. Івент не створено.");
        }
    }
}