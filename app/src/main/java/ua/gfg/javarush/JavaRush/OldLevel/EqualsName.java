package ua.gfg.javarush.JavaRush.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EqualsName {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();

        int a = name1.length();
        int b = name2.length();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (a == b) {
            System.out.println("Длины имен равны");
        } else {
            System.out.println("error");
        }
    }
}
