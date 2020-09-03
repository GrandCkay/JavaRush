package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinAndMaxArrayList {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        int[] list = getInts();
        int maximum = list[0];
        int minimum = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] > maximum) {
                maximum = list[i];
            }
            if (list[i] < minimum) {
                minimum = list[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }

    //напишите тут ваш код
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ints = new int[20];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }
        return ints;
    }
}
