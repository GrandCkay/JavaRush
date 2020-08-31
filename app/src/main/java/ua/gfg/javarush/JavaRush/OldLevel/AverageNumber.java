package ua.gfg.javarush.JavaRush.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AverageNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());

        int temp;
        int[] ints = {number1, number2, number3};
        boolean sorted = false;

        while (!sorted){
            sorted = true;
            for (int i = 0; i < ints.length - 1; i++) {
                if (ints[i] > ints[i + 1]) {
                    temp = ints[i];
                    ints[i] = ints[i + 1];
                    ints[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.println(ints[1]);
    }
}
