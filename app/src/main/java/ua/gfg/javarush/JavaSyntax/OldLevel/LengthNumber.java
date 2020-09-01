package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LengthNumber {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String number = reader.readLine();
        int num = Integer.parseInt(number);

        int count = number.length();

        int newNum = num;
        int newCount = 0;

        while (newNum > 0) {
            if (newNum == 100) {
                newCount = 3;
                break;
            } else if (newNum == 10) {
                newCount = 2;
                break;
            } else if (newNum == 1) {
                newCount = 1;
                break;
            }
            newNum--;
        }
        System.out.println("newCount " + newCount);
        System.out.println("count " + count);


        if (num > 0 && num < 1000) {
            if (num % 2 == 0) {
                if (count == 1) {
                    System.out.println("четное однозначное число");
                } else if (count == 2) {
                    System.out.println("четное двузначное число");
                } else {
                    System.out.println("четное трехзначное число");
                }
            } else {
                if (count == 1) {
                    System.out.println("нечетное однозначное число");
                } else if (count == 2) {
                    System.out.println("нечетное двузначное число");
                } else {
                    System.out.println("нечетное трехзначное число");
                }
            }
        }
    }
}
