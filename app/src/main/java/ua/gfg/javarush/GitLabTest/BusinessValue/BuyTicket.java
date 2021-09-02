package ua.gfg.javarush.GitLabTest.BusinessValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ua.gfg.javarush.GitLabTest.Bean.*;


public class BuyTicket {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void buyTicket() throws IOException {

        String eventNameTicket, customer;
        int quantityTicket, priceTicket;

        System.out.println("Введіть назву івенту:");
        eventNameTicket = bufferedReader.readLine();

        do {

            for (Event event : Event.eventList) {
                if (event.getNameEvent().equalsIgnoreCase(eventNameTicket)) {

                    System.out.println("Введіть кількість квитків, доступно - " + event.getQuantity());
                    int count = StringAdapter.stringAdapter(bufferedReader.readLine(), bufferedReader);
                    quantityTicket = quantityTicket(event, count);
                    event.setQuantity(event.getQuantity() - quantityTicket);


                    priceTicket = quantityTicket * event.getPrice();
                    System.out.println("Кількість квитків яку Ви бажаєте придбати - " + quantityTicket
                            + ". Загальна вартість складе: " + priceTicket);

                    System.out.println("Введіть ім'я та прізвище покупця");
                    customer = bufferedReader.readLine();

                    Ticket ticket = new Ticket(eventNameTicket, quantityTicket, priceTicket, customer);
                    Ticket.ticketList.add(ticket);
                    System.out.println("Готово, вітаю!\n");
                    return;
                }
            }

            System.out.println("Івент не знайдено, спробуйте ще раз. або натисніть 0");

        } while (!(eventNameTicket = bufferedReader.readLine()).equals("0"));
    }

    private static int quantityTicket(Event event, int i) {
        if (i < 0) {
            i *= -1;
        }

        if (i <= event.getQuantity()) {
            return i;
        } else {
            System.out.println("Вам будет продано максимальна доступка кількість квитків - " + event.getQuantity());
            return event.getQuantity();
        }
    }
}
