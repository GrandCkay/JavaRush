package ua.gfg.javarush.JavaRush.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumString {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            String s = reader.readLine();
            if (s.equals("сумма")) {
                System.out.println(sum);
                break;
            }
            int i = Integer.parseInt(s);
            sum += i;
        }
    }
}
