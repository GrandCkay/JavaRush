package ua.gfg.javarush.JavaCore.Level8;

import android.os.Build;

import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


// C:\Users\Home\Desktop\1.txt
public class OccurrenceOfCharacters {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) throws IOException {
        args = new String[]{"C:\\Users\\Home\\Desktop\\1.txt"};

        // 2
        int[] inst = new int[128];

        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                inst[fileReader.read()]++;
            }
        }

        for (int i = 0; i < inst.length; i++) {
            if (inst[i] != 0) {
                System.out.println((char) i + " " + inst[i]);
            }
        }

//        // 1
//        Map<Character, Integer> map = new TreeMap<>();
//
//        try (FileReader fileReader = new FileReader(args[0])) {
//            while (fileReader.ready()) {
//                char i = (char) fileReader.read();
//                map.put(i, map.getOrDefault(i, 0) + 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}
