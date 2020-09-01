package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class WordsInReverseOrderArrayList {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (arrayList.size() < 5) {
            arrayList.add(reader.readLine());
        }

        arrayList.remove(2);

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }
    }
}
