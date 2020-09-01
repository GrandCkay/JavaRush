package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArrayStringInReverseOrder {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] text = new String[10];

        for (int i = 0; i < text.length - 2; i++) {
            text[i] = reader.readLine();
        }

//        for (int i = text.length - 1; i >= 0; i--) {
//            System.out.println(text[i]);
//        }

        String[] second = new String[text.length];
        for (int i = text.length - 1, j = 0; j < text.length; i--, j++) {
            second[j] = text[i];
        }

        for (String i : second) {
            System.out.println(i);
        }
    }
}
