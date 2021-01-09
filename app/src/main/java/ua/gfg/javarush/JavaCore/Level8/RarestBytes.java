package ua.gfg.javarush.JavaCore.Level8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

// C:\Users\Home\Desktop\1.txt
public class RarestBytes {
    public static void main(String[] args) throws Exception {

        // 2
        int[] byteCount = new int[256];

//        // 1
//        HashMap<Integer, Integer> map = new HashMap<>();

        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            while (in.available() > 0) {
                // 2
                byteCount[in.read()]++;

//                // 1.1
//                int temp = in.read();
//
//                if (!map.containsKey(temp)) {
//                    map.put(temp, 1);
//                } else {
//                    map.put(temp, map.get(temp) + 1);
//                }
            }
        }

        // 2
        int count = Integer.MAX_VALUE;
        for (int i : byteCount) {
            if (i > 0 && i < count) {
                count = i;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i = 0; i < byteCount.length; i++) {
            if (byteCount[i] == count) {
                arrayList.add(i);
            }
        }

        for (Integer integer : arrayList) {
            System.out.print(integer + " ");
        }


//        // 1
//        int count = Collections.min(new ArrayList<>(map.values()));
//
//        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == count) {
//                for (int i = 0; i < count; i++) {
//                    System.out.print(entry.getKey() + " ");
//                }
//            }
//        }
    }
}
