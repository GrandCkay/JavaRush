package ua.gfg.javarush.JavaSyntax.Level10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class UpdateHashMap {
    static Integer index;
    static String name;
    HashMap<Integer, String> map;

    public UpdateHashMap() {
        this.map = new HashMap<Integer, String>();
//        map.put(index, name);
    }

    public static void main(String[] args) throws IOException {
        UpdateHashMap solution = new UpdateHashMap();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
            solution.map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }
}
