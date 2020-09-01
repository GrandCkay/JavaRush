package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenAndOdd {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number > 0) {
            while (number > 0) {
                if (number % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                number = number / 10;
            }

            System.out.println("Even: " + even + " Odd: " + odd);
        }
    }
}
