package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class UpdateReverseOrder {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        Arrays.sort(array);

        int[] ints = new int[array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            ints[i] = array[j];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = ints[i];
        }
    }
}
