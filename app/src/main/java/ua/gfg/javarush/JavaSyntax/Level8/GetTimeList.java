package ua.gfg.javarush.JavaSyntax.Level8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class GetTimeList {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // напишите тут ваш код
        Date startTime = new Date();
        get10000(list);
        Date offTime = new Date();
        long l = offTime.getTime() - startTime.getTime();
        // напишите тут ваш код

        return l;
    }

    public static void get10000(List list) {
        if (list.isEmpty()) {
            return;
        }
        int x = list.size() / 2;
        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}
