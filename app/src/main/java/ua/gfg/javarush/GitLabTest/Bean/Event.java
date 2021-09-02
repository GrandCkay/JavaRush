package ua.gfg.javarush.GitLabTest.Bean;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;


public class Event implements Comparable<Event> {
    private String nameEvent;
    private String dateString;
    private int price;
    private int quantity;
    private Date dateEvent;
    public static ArrayList<Event> eventList = new ArrayList<>();


    public Event(String nameEvent, String dateString, int price, int quantity) {
        this.dateString = dateString;
        this.nameEvent = nameEvent;
        this.price = price;
        this.quantity = quantity;
        try {
            setDate();
        } catch (ParseException e) {
            e.printStackTrace();
        }
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

    public Date getDateEvent() {
        return dateEvent;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDate() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH);
        this.dateEvent = dateFormat.parse(getDateString());
    }


    @Override
    public String toString() {
        return String.format("Назва івенту - %s, дата проведення - %s, " +
                "вартість білету - %d, кількість доступних білетів - %d", getNameEvent(), getDateString(), getPrice(), getQuantity());
    }

    @Override
    public int compareTo(Event event) {
        if (this.getDateEvent().after(event.getDateEvent())) {
            return 1;
        } else {
            return -1;
        }
    }
}
