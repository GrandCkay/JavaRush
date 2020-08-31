package ua.gfg.javarush.JavaRush.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TrafficLights {
    public static void main(String[] args) throws Exception {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String clock = reader.readLine();
        double time = Double.parseDouble(clock);

        double absoluteTime = 0;

        if (time % 5 != 0) {
            absoluteTime = time % 5;
            System.out.println("Остаток от деления " + time + " на 5 равно " + absoluteTime);
        } else if (time <= 0) {
            System.out.print("");
        } else {
            System.out.println("Остаток от деления " + time + " на 5 не равняется 0");
        }


        if (absoluteTime <= 0) {
            System.out.println("Введено не верное время");
        } else if (absoluteTime < 3) {
            System.out.println("зеленый");
        } else if (absoluteTime < 4) {
            System.out.println("желтый");
        } else if (absoluteTime < 5) {
            System.out.println("красный");
        }
    }
}
