package ua.gfg.javarush.GitLabTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;

public class Menu {
    public static void menu() {
        String menuString = "\nДля створення нового івенту натисніть - 1." +
                            "\nДля купівлі квитків натисніть - 2." +
                            "\nДля перегляду доступних івентів натисніть - 3." +
                            "\nДля перегляду придбаних квитків натисніть - 4." +
                            "\nДля завершення натисніть - 0";

        System.out.println(menuString);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;

            while (!(line = reader.readLine()).equals("0")) {
                switch (line) {
                    case "1":
                        createNewEvent();
                        break;
                    case "2":
                        buyTicket();
                        break;
                    case "3":
                        getEventList();
                        break;
                    case "4":
                        lookTicket();
                        break;
                    default:
                        System.out.println("Невірний вибір.");
                }
                System.out.println(menuString);
            }
            System.out.println("Дякую, допобачення.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createNewEvent() throws IOException {
        BufferedReader readerCreateEvent = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите название события");
        String nameEvent = readerCreateEvent.readLine();

        System.out.println("Введите дату события в формате дд.мм.гггг");
        String dateString = readerCreateEvent.readLine();


        System.out.println("Введите стоимость билета");
        int price = 0;
        try {
            price = Integer.parseInt(readerCreateEvent.readLine());
        } catch (IOException e) {
            System.out.println("Пожалуйста вводите стоимость билета цифрами. Начнем сначала.");
            createNewEvent();
        }

        System.out.println("Введите количество доступных билетов");
        int quantity = 0;
        try {
            quantity = Integer.parseInt(readerCreateEvent.readLine());
        } catch (IOException e) {
            System.out.println("Пожалуйста вводите количество билета цифрами. Начнем сначала.");
            createNewEvent();
        }

        Event event = new Event(nameEvent, dateString, price, quantity);

        try {
            event.setDate();
            Event.eventList.add(event);
            System.out.println("Событие создано.");
        } catch (ParseException e) {
            System.out.println("Дата введена не верно. Событие не создано.");
        }
    }

    private static void getEventList() {
        for (Event event : Event.eventList) {
            System.out.println(event.toString());
        }
        System.out.println();
    }

    private static void buyTicket() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String eventNameTicket, customer;
        int countTicket, priceTicket;

        System.out.println("Введите название события");
        eventNameTicket = bufferedReader.readLine();

        do {
            for (Event event : Event.eventList) {
                if (event.getNameEvent().equals(eventNameTicket)) {

                    System.out.println("Введите количество билетов");
                    countTicket = Integer.parseInt(bufferedReader.readLine());

                    priceTicket = countTicket * event.getPrice();
                    System.out.println("Общая стоимость составит: " + priceTicket);

                    System.out.println("Введите имья и фамилию покупателя");
                    customer = bufferedReader.readLine();

                    Ticket ticket = new Ticket(eventNameTicket, countTicket, priceTicket, customer);
                    Ticket.ticketList.add(ticket);
                    System.out.println("Готово, поздравляю!\n");
                    return;
                }
            }

            System.out.println("Событие не найдено, попробуйте еще раз. Или нажмите 0");

        } while (!bufferedReader.readLine().equals("0"));
    }

    private static void lookTicket() {

    }

}
