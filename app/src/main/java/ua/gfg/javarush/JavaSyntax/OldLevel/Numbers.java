package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.*;

public class Numbers {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n1 = reader.readLine();
        String n2 = reader.readLine();
        String n3 = reader.readLine();
        String n4 = reader.readLine();

        int number1 = Integer.parseInt(n1);
        int number2 = Integer.parseInt(n2);
        int number3 = Integer.parseInt(n3);
        int number4 = Integer.parseInt(n4);

        //  return max number
        if (number1 > number2 && number1 > number3 && number1 > number4) {
            System.out.println("Max " + number1);
        } else if (number2 > number1 && number2 > number3 && number2 > number4) {
            System.out.println("Max " + number2);
        } else if (number3 > number1 && number3 > number2 && number3 > number4) {
            System.out.println("Max " + number3);
        } else if (number4 > number1 && number4 > number2 && number4 > number3) {
            System.out.println("Max " + number2);
        } else {
            System.out.println("Max " + number2);
        }

        //  return min number
        if (number1 > number2) {
            System.out.println("Min " + number2);
        } else if (number2 > number1) {
            System.out.println("Min " + number1);
        }

        //  return index number
        int[] numbers = {number1, number2, number3};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        if (number1 == number2) {
            System.out.println("Index min of 3 - " + numbers[2]);
        } else if (number1 == number3) {
            System.out.println("Index min of 3 - " + numbers[1]);
        } else {
            System.out.println("Index min of 3 - " + numbers[0]);
        }
    }
}
