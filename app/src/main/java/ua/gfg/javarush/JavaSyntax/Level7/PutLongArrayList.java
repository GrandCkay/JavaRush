package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PutLongArrayList {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        boolean sort = true;
        String temp;
        while (sort) {
            sort = false;
            for (int i = 0; i < strings.size() - 1; i++) {
                if (strings.get(i).length() > strings.get(i + 1).length()) {
                    temp = strings.get(i);
                    strings.set(i, strings.get(i + 1));
                    strings.set(i + 1, temp);
                    sort = true;
                }
            }
        }

        for (int i = 1; i <= strings.size(); i++) {
            if (strings.get(strings.size() - 1).length() == strings.get(strings.size() - i).length()) {
                System.out.println(strings.get(strings.size() - i));
            }
        }
    }
}
