package ua.gfg.javarush.JavaRush.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TaskOnArrayList {
    public static void main(String[] args) throws Exception {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("mom");
        arrayList.add("dad");
        arrayList.add("son");
        arrayList.add("daughter");
        arrayList.add("cat");

        System.out.println(arrayList.size());

        for (String i : arrayList) {
            System.out.println(i);
        }


        ArrayList<String> arrayList1 = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            arrayList1.add(0, reader.readLine());
        }

        for (String i : arrayList1) {
            System.out.println(i);
        }


    }
}
