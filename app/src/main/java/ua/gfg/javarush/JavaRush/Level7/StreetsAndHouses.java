package ua.gfg.javarush.JavaRush.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreetsAndHouses {
    public static void main(String[] args) throws IOException {
        int[] numbers = new int[15];
        int evenCount = 0;
        int oddCount = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                evenCount += numbers[i];
            } else {
                oddCount += numbers[i];
            }
        }
//        System.out.println("evenCount " + evenCount);
//        System.out.println("oddCount " + oddCount);

        if (evenCount > oddCount) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
