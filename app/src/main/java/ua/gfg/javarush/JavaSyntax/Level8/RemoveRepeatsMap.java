package ua.gfg.javarush.JavaSyntax.Level8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class RemoveRepeatsMap {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("Java Family1", "Java1");
        for (int i = 1; i < 10; i++) {
            stringStringMap.put("Family" + i, "Name");
        }
        stringStringMap.put("Java Family", "Java");
        return stringStringMap;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код
//        Map<String, String> copy = new HashMap<>(map);
//        for (String s : copy.values()) {
//            if ((Collections.frequency(copy.values(), s)) > 1) {
//                removeItemFromMapByValue(map, s);
//            }
//        }
        ArrayList<String> arrayList = new ArrayList<>(map.values());
        String nameValue = "";
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i - 1).equals(arrayList.get(i))) {
                nameValue = arrayList.get(i);
            }
            removeItemFromMapByValue(map, nameValue);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }

        System.out.println("\nNew");

        removeTheFirstNameDuplicates(map);

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
