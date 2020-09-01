package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlusNumber {
    private static int count = 0;

    public static void main(String[] args)throws Exception{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        if (a > 0) {
            count();
        }
        if (b > 0) {
            count();
        }
        if (c > 0) {
            count();
        }
        System.out.println(count);
    }

    static void count() {
        count++;
    }

}
