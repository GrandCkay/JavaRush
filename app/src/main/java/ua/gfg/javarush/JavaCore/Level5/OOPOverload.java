package ua.gfg.javarush.JavaCore.Level5;

import java.math.BigDecimal;

public class OOPOverload {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object
        new Tree().info((Object) new Integer("4"));
        new Tree().info((Object) new Short("4"));
        new Tree().info((Object) new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number
        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        //Блок 4.
        //Вызов для String
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}

class Tree {
    public static int globalNumber;
    public int number;

    public Tree() {
        this.number = ++globalNumber;
    }

    public void info(Object o) {
        System.out.println(String.format("Дерево № %d , метод Object, параметр %s", number, o.getClass().getSimpleName()));
    }

    public void info(Number n) {
        System.out.println(String.format("Дерево № %d , метод Number, параметр %s", number, n.getClass().getSimpleName()));
    }

    public void info(String s) {
        System.out.println(String.format("Дерево № %d , метод String, параметр %s", number, s.getClass().getSimpleName()));
    }
}
