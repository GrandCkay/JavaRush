package ua.gfg.javarush.Test;

import java.util.Set;
import java.util.TreeSet;

public class Test1 {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        for (int i = 11; i > -1; i--) {
            set.add(i);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }

//        int a = 5;
//        int b = 4;
//        int c = 3;
//        int e = 2;
//        double d = a + b / c / (double) e;
//        System.out.println(1 / e);
//        System.out.println(1 / (double) e);
//        System.out.println( d);

//        Set<Apple> apples = new HashSet<>();
//        for (int i1 = 0; i1 < 3; i1++) {
//            apples.add(new Apple());
//        }
//        for (Apple apple : apples) {
//            System.out.println(apple.id());
//        }
//    }
//}
//
//class Apple {
//    private static long counter;
//    private final long id = counter++;
//    private String name = "Name";
//
//    public String id() {
//        return name + id;
    }
}

