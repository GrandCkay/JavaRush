package ua.gfg.javarush.JavaCore.Level8;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/*
    Самые частые байты: 8 уровень, 3 лекция Java Core / Most frequent bytes: level 8, lesson 3 JavaRush

        Задание от JavaRush
    Самые частые байты: 8 уровень, 3 лекция Java Core
    Ввести с консоли имя файла. Найти байт или байты с максимальным количеством повторов.
    Для чтения из файла используй поток FileInputStream. Вывести их на экран через пробел в одну строку.
    Закрыть поток ввода- вывода.
 */


// C:\Users\Home\Desktop\1.txt
public class MostFrequentBytes {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) throws Exception {

//        // 3
//        int num;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
//            while (in.available() > 0) {
//                int i = in.read();
//                arrayList.add(i);
//            }
//        }
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            num = Collections.frequency(arrayList, arrayList.get(i));
//            map.put(arrayList.get(i), num);
//        }


//        // 2
//        int[] byteCount = new int[256];
//        int count = 0;
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
//            while (in.available() > 0) {
//                int i = in.read();
//                byteCount[i]++;
//            }
//        }
//
//        for (int i : byteCount) {
//            if (i > count) {
//                count = i;
//            }
//        }
//
//        for (int i = 0; i < byteCount.length; i++) {
//            if (byteCount[i] == count) {
//                arrayList.add(i);
//            }
//        }
//
//        for (Integer integer : arrayList) {
//            System.out.print(integer + " ");
//        }


        // 1
        HashMap<Integer, Integer> map = new HashMap<>();

        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            while (in.available() > 0) {
                int i = in.read();
                // 1
                if (!map.containsKey(i)) {
                    map.put(i, 0);
                } else {
                    map.put(i, map.get(i) + 1);
                }
//                // 1.1
//                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }

        // 1 and 3
        int count = Collections.max(map.values());

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == count) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
