package ua.gfg.javarush.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set<Apple> apples = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        for (Apple apple : apples) {
            System.out.println(apple.id());
        }
    }
}

class Apple {
    private static long counter;
    private final long id = counter++;
    private String name = "Name";

    public String id() {
        return name + id;
    }
}

