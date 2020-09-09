package ua.gfg.javarush.JavaSyntax.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class UpdatePO {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        List<String> list = new ArrayList<>();
//        while (true) {
//            String family = reader.readLine();
//            if (family.isEmpty()) {
//                break;
//            }
//
//            list.add(family);
//        }
//        // Read the house number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 < houseNumber && houseNumber <= list.size()) {
//            String familyName = list.get(houseNumber - 1);
//            System.out.println(familyName);
//        }

        Map<String, String> stringMap = new HashMap<>();

        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) {
                break;
            }
            String family = reader.readLine();
            stringMap.put(town, family);
        }

        String sity = reader.readLine();

        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key.equalsIgnoreCase(sity)) {
                System.out.println(value);
            }
        }
    }
}





















