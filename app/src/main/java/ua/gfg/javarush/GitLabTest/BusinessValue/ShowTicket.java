package ua.gfg.javarush.GitLabTest.BusinessValue;

import java.util.Map;

import ua.gfg.javarush.GitLabTest.Bean.*;

public class ShowTicket {
    public static void showTicket() {
        for (Ticket ticket : Ticket.ticketList) {
            if (ticket.getCount() != 0) {
                Ticket.stringTicketMap.put(ticket.getCustomer(), ticket);
            }
        }


        for (Map.Entry<String, Ticket> ticketEntry : Ticket.stringTicketMap.entrySet()) {
            System.out.println(ticketEntry.getValue().getEventNameTicket() + " "
                    + ticketEntry.getValue().getCustomer() + " "
                    + ticketEntry.getValue().getCount());
        }
    }
}
