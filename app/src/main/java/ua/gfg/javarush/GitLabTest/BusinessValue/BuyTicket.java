package ua.gfg.javarush.GitLabTest.BusinessValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ua.gfg.javarush.GitLabTest.Bean.*;


public class BuyTicket {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void buyTicket() throws IOException {

        String eventNameTicket, customer;
        int countTicket, priceTicket;

        System.out.println("Введіть назву івенту:");
        eventNameTicket = bufferedReader.readLine();

        do {

            for (Event event : Event.eventList) {
                if (event.getNameEvent().equals(eventNameTicket)) {

                    System.out.println("Введіть кількість квитків:");
                    countTicket = StringAdapter.stringAdapter(bufferedReader.readLine(), bufferedReader);

                    priceTicket = countTicket * event.getPrice();
                    System.out.println("Загальна вартість складе: " + priceTicket);

                    System.out.println("Введіть ім'я та прізвище покупця");
                    customer = bufferedReader.readLine();

                    Ticket ticket = new Ticket(eventNameTicket, countTicket, priceTicket, customer);
                    Ticket.ticketList.add(ticket);
                    System.out.println("Готово, вітаю!\n");
                    return;
                }
            }

            System.out.println("Івент не знайдено, спробуйте ще раз. або натисніть 0");

        } while (!(eventNameTicket = bufferedReader.readLine()).equals("0"));
    }
}
