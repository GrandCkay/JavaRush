package ua.gfg.javarush.JavaSyntax.Level7;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MostShortOrLong {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
//        ArrayList<String> arrayList = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            if (list.get(i).length() < min) {
                min = list.get(i).length();
            }
            if (list.get(i).length() > max) {
                max = list.get(i).length();
            }
        }

//        for (int i = 0; i < list.size(); i++) {
//            arrayList.add(list.get(i));
//        }
//
//        boolean sort = true;
//        String temp;
//        while (sort) {
//            sort = false;
//            for (int i = 0; i < arrayList.size() - 1; i++) {
//                if (arrayList.get(i).length() > arrayList.get(i + 1).length()) {
//                    temp = arrayList.get(i);
//                    arrayList.set(i, arrayList.get(i + 1));
//                    arrayList.set(i + 1, temp);
//                    sort = true;
//                }
//            }
//        }
//
//        int max = arrayList.get(arrayList.size() - 1).length();
//        int min = arrayList.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min || list.get(i).length() == max) {
                System.out.println(list.get(i));
                break;
            }
        }
    }
}
