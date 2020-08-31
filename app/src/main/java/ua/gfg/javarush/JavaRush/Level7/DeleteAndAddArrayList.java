package ua.gfg.javarush.JavaRush.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DeleteAndAddArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }

        for (int i = 0; i < 13; i++) {
            arrayList.add(0, arrayList.get(4));
            arrayList.remove(arrayList.size() - 1);
        }

        /*
        for (int i = 0; i < 13; i++) {
            String temp = arrayList.remove(arrayList.size() - 1);
            arrayList.add(0, temp);
        }
         */

        for (String i : arrayList) {
            System.out.println(i);
        }
    }
}
