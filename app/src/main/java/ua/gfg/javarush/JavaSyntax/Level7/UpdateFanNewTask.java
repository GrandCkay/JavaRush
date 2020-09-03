package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UpdateFanNewTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();


        while (true) {
            String s = reader.readLine();
            if (s.isEmpty() || s == null) {
                break;
            } else {
                if (s.length() % 2 == 0) {
                    arrayList.add(updateWord(s, 2));
                } else {
                    arrayList.add(updateWord(s, 3));
                }
            }
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    protected static String updateWord(String s, int count) {
        String name = "";
        for (int i = 0; i < count; i++) {
            name = s + " " + name;
        }
        return name;
    }

}
