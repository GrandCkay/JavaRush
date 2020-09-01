package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int count = 0;
        float result;

//        while (true) {
//            int number = Integer.parseInt(reader.readLine());
//                sum = sum + number;
//            if (number == -1) {
//                System.out.println(sum);
//                break;
//            }
//        }

        while (true) {
            int number = Integer.parseInt(reader.readLine());
            if (number != -1) {
                sum += number;
                count++;
            } else {
                break;
            }
        }
        result = (float) sum / count;
        System.out.println(result);
    }
}
