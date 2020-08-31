package ua.gfg.javarush.JavaRush.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComLonelyArray {
    public static void main(String[] args) throws Exception {
        String[] text = new String[10];
        int[] ints = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < text.length; i++) {
            text[i] = reader.readLine();
            ints[i] = text[i].length();
        }

        for (int i : ints) {
            System.out.println(i);
        }
    }
}
