package ua.gfg.javarush.JavaSyntax.Level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphabetOrder {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String word : array) {
            System.out.println(word);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        boolean b;
        boolean sort = false;
        String temp;
        while (!sort) {
            sort = true;
            for (int i = 0; i < array.length - 1; i++) {
                b = isGreaterThan(array[i], array[i + 1]);
                if (b) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sort = false;
                }
            }
        }
    }


    //Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
