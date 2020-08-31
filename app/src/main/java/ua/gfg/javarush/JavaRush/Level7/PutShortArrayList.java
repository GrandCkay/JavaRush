package ua.gfg.javarush.JavaRush.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PutShortArrayList {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }

        boolean sort = true;
        String temp;
        while (sort) {
            sort = false;
            for (int i = 0; i < arrayList.size() - 1; i++) {
                if (arrayList.get(i).length() < arrayList.get(i + 1).length()) {
                    temp = arrayList.get(i);
                    arrayList.set(i, arrayList.get(i + 1));
                    arrayList.set(i + 1, temp);
                    sort = true;
                }
            }
        }

        for (int i = 1; i <= arrayList.size(); i++)  {
            if (arrayList.get(arrayList.size() - 1).length() == arrayList.get(arrayList.size() - i).length()) {
                System.out.println(arrayList.get(arrayList.size() - i));
            }
        }
    }
}
