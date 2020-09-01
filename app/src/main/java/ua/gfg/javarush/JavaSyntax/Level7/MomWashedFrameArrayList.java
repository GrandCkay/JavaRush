package ua.gfg.javarush.JavaSyntax.Level7;

import java.util.ArrayList;
import java.util.Collections;

public class MomWashedFrameArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "мама", "мыла", "раму");

        for (int i = 0; i < arrayList.size() + 1; i++) {
            if (i % 2 != 0) {
                arrayList.add(i, "именно");
            }
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
