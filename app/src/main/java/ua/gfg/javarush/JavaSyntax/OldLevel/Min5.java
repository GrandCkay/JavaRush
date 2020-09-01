package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Min5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        int minimum = min(a, b, c, d, e);

        System.out.println("Minimum = " + minimum);

    }


    public static int min(int a, int b, int c, int d, int e) {
        int min;
        min = (a < b) ? a : b;
        min = (min > c) ? c : min;
//        if (min > c) {
//            min = c;
//        }
        min = (min > d) ? d : min;
//        if (min > d) {
//            min = d;
//        }
        min = (min >= e) ? e : min;
//        if (min >= e) {
//            min = e;
//        }
        return min;
    }
}
