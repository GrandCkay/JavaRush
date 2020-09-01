package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckSortingArrayList {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (arrayList.size() < 10) {
            arrayList.add(reader.readLine());
        }

        for (int i = 0; i < arrayList.size(); i++) {
            if (i == (arrayList.size() - 1)) {
                break;
            }
            if (arrayList.get(i).length() > arrayList.get(i + 1).length()) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
