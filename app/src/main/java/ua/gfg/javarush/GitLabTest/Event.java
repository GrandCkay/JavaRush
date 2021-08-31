package ua.gfg.javarush.GitLabTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class Event {
    private String nameEvent;
    private String dateString;
    private int price;
    private int quantity;
    private Date dateEvent;
    public static List<Event> eventList = new ArrayList<>();


    public Event(String nameEvent, String dateString, int price, int quantity) {
        this.dateString = dateString;
        this.nameEvent = nameEvent;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public String getDateString() {
        return dateString;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setDate() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        this.dateEvent = dateFormat.parse(getDateString());
    }

    public Date getDateEvent() {
        return dateEvent;
    }

    @Override
    public String toString() {
        return String.format("Назва івенту - %s, дата проведення - %s, " +
                "вартість білету - %d, кількість доступних білетів - %d", getNameEvent(), getDateString(), getPrice(), getQuantity());
    }
}
