package ua.gfg.javarush.JavaSyntax.Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AddFanFromHashMap {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();

        while (true) {
            String text = reader.readLine();
            if (text.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(text);
            String name = reader.readLine();
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String i = entry.getKey();
            Integer s = entry.getValue();
            System.out.println(s + " " + i);
        }
    }
}
