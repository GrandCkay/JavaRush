package ua.gfg.javarush.JavaCore.Level4;

import java.util.LinkedList;
import java.util.List;

public class Up4Errors {
    private static void initList(List<Number> list) {
        //3
        list.add(new Double(1000f));
        list.add(new Double("123e-445632"));
        list.add(new Float(-90 / -3));
        list.remove(new Double("123e-445632"));
    }

    private static void printListValues(List<Number> list) {
        //4 - Исправь 2 ошибки
        for (int i = 0; i < list.size(); i++) {     // !!!
            System.out.println(list.get(i));
        }
    }

    private static void processCastedObjects(List<Number> list) {
        //5
        for (Number object : list) {
            //Исправь 2 ошибки
            if (object instanceof Float) {
                Float a = (Float) object;       // !!!
                System.out.println("Is float value defined? " + !(a.isNaN()));  // Является ли обьект не(не числом)
            } else if (object instanceof Double) {
                Double a = (Double) object;     // !!!
                System.out.println("Is double value infinite? " + a.isInfinite()); // Является ли обьект бесконечностью
            }
        }
    }

    public static void main(String[] args) {
        List<Number> list = new LinkedList<Number>();
        initList(list);
        printListValues(list);
        processCastedObjects(list);
    }
}
