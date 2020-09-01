package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LearYearsOrNot {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String day = reader.readLine();
        int number = Integer.parseInt(day);


        int a = number % 400;
        int b = a % 100;
        int c = b % 4;

        if (a == 0) {
            System.out.println("количество дней в году: 366");
        } else if (b == 0) {
            System.out.println("количество дней в году: 365");
        } else if (c == 0) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }


        String cycleOff = "На данной строчке цикл заканчивается, так как условие выполняеться";

        System.out.println("Остаток от деления " + number + " на 400 равный:" + a);
        if (a == 0) {
            System.out.println(cycleOff);
        }
        System.out.println("Остаток от деления " + a + " на 100 равный:" + b);
        if (b == 0 && a != 0) {
            System.out.println(cycleOff);
        }
        System.out.println("Остаток от деления " + b + " на 4 равный:" + c);
        if (c == 0 && a != 0 && b != 0) {
            System.out.println(cycleOff);
        }
    }
}

