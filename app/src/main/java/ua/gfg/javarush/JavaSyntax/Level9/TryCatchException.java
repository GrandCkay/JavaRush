package ua.gfg.javarush.JavaSyntax.Level9;

import java.util.ArrayList;
import java.util.HashMap;

public class TryCatchException {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            int a = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.println(e.getClass());
        }

        String s = null;
        try {
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        int[] m = new int[2];
        try {
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        ArrayList<String> list = new ArrayList<String>();
        try {
            String s1 = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }

        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }
}
