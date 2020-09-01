package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumberSort {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] numbers = new int[5];
//        int temp;
//        boolean sort = false;
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(reader.readLine());
//        }
//
//        while (!sort) {
//            sort = true;
//            for (int i = 0; i < numbers.length - 1; i++) {
//                if (numbers[i] > numbers[i + 1]) {
//                    temp = numbers[i];
//                    numbers[i] = numbers[i + 1];
//                    numbers[i + 1] = temp;
//                    sort = false;
//                }
//            }
//        }
//
//        for (int i : numbers) {
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();

        while (arrayList.size() < 5) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(arrayList);

//        int[] ints = new int[arrayList.size()];
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = arrayList.get(i);
//        }

        Integer[] ints = arrayList.toArray(new Integer[arrayList.size()]);

        for (int i : ints) {
            System.out.println(i);
        }
    }
}
