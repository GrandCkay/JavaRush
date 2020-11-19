package ua.gfg.javarush.JavaCore.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StaticCase2 {
    public static int A;
    public static int B;
    public static final int MIN = min(A, B);

    static {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            A = Integer.parseInt(reader.readLine());
            B = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
