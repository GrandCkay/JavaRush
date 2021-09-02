package ua.gfg.javarush.GitLabTest.BusinessValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import ua.gfg.javarush.GitLabTest.Bean.*;

public class CreateNewEvent {
    private static BufferedReader readerCreateEvent = new BufferedReader(new InputStreamReader(System.in));
    private static String dateString;

    public static void createNewEvent() throws IOException {
        System.out.println("Введіть назву івенту:");
        String nameEvent = readerCreateEvent.readLine();

        System.out.println("Введіть дату івенту в форматі дд.мм.рррр");
        dateString = readerCreateEvent.readLine();
        Date date = dateAdapter(dateString, readerCreateEvent);

        System.out.println("Введіть вартість квитка:");
        int price = StringAdapter.stringAdapter(readerCreateEvent.readLine(), readerCreateEvent);

        System.out.println("Введіть кількість доступних квитків:");
        int quantity = StringAdapter.stringAdapter(readerCreateEvent.readLine(), readerCreateEvent);

        Event event = new Event(nameEvent, dateString, price, quantity);
        Event.eventList.add(event);
        System.out.println("Івент створено.");
    }

    private static Date dateAdapter(String s, BufferedReader bufferedReader) throws IOException {

        Date date;
        try {
            date = new SimpleDateFormat("dd.MM.yyyy", Locale.ENGLISH).parse(s);

            String[] strings = s.split("\\.");

            strings[0] = setDateString(strings[0], 31, "день");
            strings[1] = setDateString(strings[1], 12, "місяць");

            StringBuilder str = new StringBuilder();
            for (int i = 0; i < strings.length; i++) {
                str.append(strings[i]);
                if (i != strings.length - 1) {
                    str.append(".");
                }
            }
            dateString = str.toString();

        } catch (ParseException parseException) {
            System.out.println("Помилка вводу, повторіть. Будь ласка введіть дату івенту в форматі дд.мм.рррр");
            date = dateAdapter(bufferedReader.readLine(), bufferedReader);
        }
        return date;
    }

    private static String setDateString(String string, int i, String value) {
        String s = string;

        if (Integer.parseInt(string) > 0 && Integer.parseInt(string) < 10) {
            if (!string.startsWith("0")) {
                s = "0" + string;
            }
        } else if (Integer.parseInt(string) > i) {
            System.out.println("Помилка вводу, для нового івенту буде встанновлено " + i + " " + value);
            s = "12";
        }
        return s;
    }
}