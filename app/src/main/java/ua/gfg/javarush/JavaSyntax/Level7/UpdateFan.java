package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class UpdateFan {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        while (true) {
            String name = reader.readLine();
            if (name == null || name.isEmpty()) {
                break;
            } else {
                arrayList.add(name.toUpperCase());
            }
        }

        for (String s : arrayList) {
            System.out.println(s);
        }
    }
}
