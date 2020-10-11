package ua.gfg.javarush.JavaSyntax.Level8;

import java.util.HashMap;
import java.util.Map;

//8.8

public class PopulationCensus {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        for (int i = 1; i < 10; i++) {
            map.put("Family" + i, "Name");
        }
        map.put("Family", "Java");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        //напишите тут ваш код
        int countValue = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getValue().equals(name))
                countValue++;
        }
        return countValue;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        //напишите тут ваш код
        int countKey = 0;
        for (String s : map.keySet()) {
            if (s.equals(lastName)) {
                countKey++;
            }
        }
        return countKey;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println(getCountTheSameFirstName(map, "Name"));
        System.out.println(getCountTheSameLastName(map, "Family5"));
    }
}
