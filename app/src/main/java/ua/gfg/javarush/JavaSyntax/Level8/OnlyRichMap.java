package ua.gfg.javarush.JavaSyntax.Level8;

import java.util.HashMap;
import java.util.Map;

public class OnlyRichMap {
    public static Map<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> stringIntegerHashMap = new HashMap<>();
        String name = "Employee";
        int salary = 100;
        for (int i = 1; i < 11; i++) {
            stringIntegerHashMap.put(name + i, salary * i);
        }
        return stringIntegerHashMap;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        //напишите тут ваш код
//        Iterator<Map.Entry<String, Integer>> entryIterator = map.entrySet().iterator();
//        while (entryIterator.hasNext()) {
//            Map.Entry<String, Integer> entry = entryIterator.next();
//            if (entry.getValue() < 500) {
//                entryIterator.remove();
//            }
//        }
        Map<String, Integer> copyMap = new HashMap<>(map);
        for (Map.Entry<String, Integer> entryMap : copyMap.entrySet()) {
            String key = entryMap.getKey();
            int value = entryMap.getValue();
            if (value < 500) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " - " + value);
        }

        System.out.println("");
        removeItemFromMap(map);


        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
