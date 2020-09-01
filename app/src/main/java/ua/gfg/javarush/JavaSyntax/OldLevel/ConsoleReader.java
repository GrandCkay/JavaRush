package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader rString = new BufferedReader(new InputStreamReader(System.in));
        String s = rString.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader rInt = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(rInt.readLine());
        return i;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader rDouble = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(rDouble.readLine());
        return d;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader rBoolean = new BufferedReader(new InputStreamReader(System.in));
        boolean b = Boolean.parseBoolean(rBoolean.readLine());
        return b;
    }

    public static void main(String[] args) throws Exception {

    }
}
