package ua.gfg.javarush.JavaSyntax.Level8;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAndArrayListTime {
    public static void main(String[] args) {
        System.out.println("ArrayList add = " + getInsertTimeInMs(new ArrayList()));
        System.out.println("LinkedList add = " + getInsertTimeInMs(new LinkedList()));
    }

    public static long getInsertTimeInMs(List list) {
        // напишите тут ваш код
        Date startTime = new Date();
        insert10000(list);
        Date offTime = new Date();
        long l = offTime.getTime() - startTime.getTime();
        // напишите тут ваш код
        return l;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
