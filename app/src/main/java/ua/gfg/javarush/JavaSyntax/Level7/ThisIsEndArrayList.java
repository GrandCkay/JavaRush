package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ThisIsEndArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arrayList.size() + 1; i++) {
            String s = reader.readLine();
            if (s.equals("end")) {
                break;
            } else {
                arrayList.add(s);
            }
        }

        for (String sPrint : arrayList) {
            System.out.println(sPrint);
        }
    }
}
