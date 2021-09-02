package ua.gfg.javarush.GitLabTest.Bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ticket {
    private String customer;
    private int countTicket;
    private String eventNameTicket;
    private int priceTicket;
    public static List<Ticket> ticketList = new ArrayList<>();
    public static Map<String, Ticket> stringTicketMap = new HashMap<>();


    public Ticket(String eventNameTicket, int countTicket, int priceTicket, String customer) {
        this.customer = customer;
        this.countTicket = countTicket;
        this.eventNameTicket = eventNameTicket;
        this.priceTicket = priceTicket;
    }

    public String getCustomer() {
        return customer;
    }


    public int getCount() {
        return countTicket;
    }

    public String getEventNameTicket() {
        return eventNameTicket;
    }

    public int getPriceTicket() {
        return priceTicket;
    }

    @Override
    public String toString() {
        return String.format("Назва івенту - %s, кількість білетів - %d, " +
                        "загальна вартість - %d, ім’я та прізвище покупця - %s %s",
                getEventNameTicket(), getCount(), getPriceTicket(), getCustomer());
    }
}
