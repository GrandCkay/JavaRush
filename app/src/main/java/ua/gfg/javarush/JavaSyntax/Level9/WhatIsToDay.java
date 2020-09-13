package ua.gfg.javarush.JavaSyntax.Level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WhatIsToDay {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date dateIn = dateFormat.parse(reader.readLine());

        SimpleDateFormat formatOunDay = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        System.out.println(formatOunDay.format(dateIn).toUpperCase());
    }
}
