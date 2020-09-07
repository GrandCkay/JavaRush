package ua.gfg.javarush.JavaSyntax.Level8;

import java.util.HashMap;
import java.util.Map;

public class OneLastNameFamily {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //напишите тут ваш код
        Map<String, String> stringStringMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            stringStringMap.put("Family", "Name");
        }
        return stringStringMap;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

