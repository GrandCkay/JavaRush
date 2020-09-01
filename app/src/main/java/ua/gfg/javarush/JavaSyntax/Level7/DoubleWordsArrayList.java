package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DoubleWordsArrayList {
    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (list.size() < 5) {
            list.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(list);

        // Вывести на экран result
        for (String s : result) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size() + 1; i++) {
            if (i % 2 != 0) {
                list.add(i, list.get(i - 1) + " new");
            }
        }
        return list;
    }
}

