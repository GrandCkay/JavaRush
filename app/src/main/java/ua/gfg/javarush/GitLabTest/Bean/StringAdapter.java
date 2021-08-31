package ua.gfg.javarush.GitLabTest.Bean;

import java.io.BufferedReader;
import java.io.IOException;

public class StringAdapter {
    public static int stringAdapter(String s, BufferedReader bufferedReader) throws IOException {
        int i;
        try {
            i = Integer.parseInt(s);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Будь ласка вводьте цифрами.");
            i = stringAdapter(bufferedReader.readLine(), bufferedReader);
        }
        return i;
    }
}
