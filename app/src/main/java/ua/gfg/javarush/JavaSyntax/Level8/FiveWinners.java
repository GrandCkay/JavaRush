package ua.gfg.javarush.JavaSyntax.Level8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FiveWinners {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void reverse(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * -1;
        }
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        reverse(array);
        reverse(array);


//        Arrays.sort(array);
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < array.length; i++) {
//            list.add(array[i]);
//        }
//        Collections.reverse(list);
//        for (int i = 0; i < list.size(); i++) {
//            array[i] = list.get(i);
//        }


//        boolean sort = false;
//        int temp;
//
//        while (!sort) {
//            sort = true;
//            for (int i = 0; i < array.length - 1; i++) {
//                if (array[i] < array[i + 1]) {
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    sort = false;
//                }
//            }
//        }
    }
}
