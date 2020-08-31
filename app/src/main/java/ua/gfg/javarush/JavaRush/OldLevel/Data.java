package ua.gfg.javarush.JavaRush.OldLevel;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));

    }
}
