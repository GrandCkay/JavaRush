package ua.gfg.javarush.JavaSyntax.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;


public class NumberMonth {
    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        int number = 0;

        String[] stringsMonth = {"January", "February", "March", "April",
                "May", "June", "July", "August", "September", "October", "November", "December"};

        for (int i = 1; i < stringsMonth.length + 1; i++) {
            if (stringsMonth[i - 1].equalsIgnoreCase(month)) {
                number = i;
            }
        }

//        DateFormat dateFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
//        List<Date> dateList = new ArrayList<>();
//        dateList.add(dateFormat.parse(month));
//        number = 1 + dateList.get(0).getMonth();


//            Calendar calendar = Calendar.getInstance();
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM", Locale.ENGLISH);
//            calendar.setTime(simpleDateFormat.parse(month));
//            number = 1 + calendar.get(Calendar.MONTH);

        System.out.println(month + " is the " + number + " month");

    }
}
