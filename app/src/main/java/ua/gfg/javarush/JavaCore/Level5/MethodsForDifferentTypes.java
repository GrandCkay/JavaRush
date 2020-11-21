package ua.gfg.javarush.JavaCore.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MethodsForDifferentTypes {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i;

        while (!(s = reader.readLine()).equals("exit")) {
            try {
                if (s.contains(".")) {
                    print(Double.valueOf(s));
//                    print(Double.parseDouble(s));
                } else {
                    i = Integer.parseInt(s);
                    if (i > 0 && i < 128) {
                        print((short) i);
                    } else if (i <= 0 || i >= 128) {
                        print(i);
                    }
                }
            } catch (Exception e) {
                print(s);
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
