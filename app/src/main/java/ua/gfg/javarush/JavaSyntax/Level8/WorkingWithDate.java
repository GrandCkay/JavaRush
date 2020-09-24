package ua.gfg.javarush.JavaSyntax.Level8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class WorkingWithDate {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("February 1 1970"));
    }

    public static boolean isDateOdd(String date) throws ParseException {

        DateFormat dateFormat = new SimpleDateFormat("MMMM d yyyy", Locale.ENGLISH);

        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dateFormat.parse(date));
//
//        int year = calendar.get(Calendar.YEAR);
//        Calendar calendarFirst = new GregorianCalendar(year, Calendar.JANUARY, 1);
//        int dayYear = calendar.get(Calendar.DAY_OF_YEAR) - calendarFirst.get(Calendar.DAY_OF_YEAR);
//        System.out.println(dayYear);
//
//        if (dayYear == 0 || dayYear % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }


        return calendar.get(Calendar.DAY_OF_YEAR) % 2 != 0;

//        Date date1 = new Date(Date.parse(date));
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("D");
//        int n = Integer.parseInt(simpleDateFormat.format(date1));
//
//        return (n % 2 == 0) ? false : true;
    }
}
