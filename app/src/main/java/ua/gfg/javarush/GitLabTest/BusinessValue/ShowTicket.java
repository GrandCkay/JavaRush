package ua.gfg.javarush.GitLabTest.BusinessValue;

import ua.gfg.javarush.GitLabTest.Bean.*;

public class ShowTicket {
    public static void showTicket() {

        for (Ticket ticket : Ticket.ticketList) {
            if (ticket.getCount() != 0) {
                Ticket.stringTicketSet.add(ticket.getEventNameTicket());
            } else {
                System.out.println("Проданих квитків немає");
            }
        }

        for (String string : Ticket.stringTicketSet) {
            System.out.println(string + ":");

            int index = 0;

            for (Ticket ticket : Ticket.ticketList) {
                if (ticket.getEventNameTicket().equals(string)) {
                    index++;

                    System.out.println(index + ". " + ticket.getCustomer()
                            + " " + ticket.getCount() + "шт.");
                }
            }
        }
    }
}
