package ua.gfg.javarush.JavaCore.Level8;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*
Нити и байты
 */

// C:\Users\Home\Desktop\1.txt
public class ThreadsAndBytes {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileName;

            while (!(fileName = reader.readLine()).equals("e")) {
                new ReadThread(fileName).start();
            }
        }

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            int i = entry.getValue();
            System.out.println(entry.getKey() + " " + (char) i);
        }
    }

    public static class ReadThread extends Thread {
        public FileInputStream inputStream;
        public String fileName;

        public ReadThread(String fileName) throws FileNotFoundException {
            //implement constructor body
            inputStream = new FileInputStream(fileName);
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        public synchronized void run() {
            int max = 0, number = 0;
            int[] ints = new int[256];



            // 3
            HashMap<Integer, Integer> hashMap = new HashMap();

            try (FileInputStream in = new FileInputStream(fileName)) {
                while (inputStream.available() > 0) {
                    int i = inputStream.read();
                    if (hashMap.containsKey(i)) {
                        int value = hashMap.get(i) + 1;
                        hashMap.replace(i, value);
                        if (value > max) {
                            max = value;
                            number = i;
                        }
                    } else {
                        hashMap.put(i, 1);
                    }
                }
                resultMap.put(fileName, number);



//            // 2
//            try (FileInputStream in = new FileInputStream(fileName)) {
//                while (inputStream.available() > 0) {
//                    int i = inputStream.read();
//                    ints[i]++;
//                }


//            // 1
//            try {
//                while (inputStream.available() > 0) {
//                    int i = inputStream.read();
//                    ints[i]++;
//                }
//                inputStream.close();
//
//                for (int anInt : ints) {
//                    if (anInt > max) {
//                        max = anInt;
//                    }
//                }
//
//                for (int i = 0; i < ints.length; i++) {
//                    if (ints[i] == max) {
//                        resultMap.put(fileName, i);
//                    }
//                }
            } catch (IOException e) {
                e.printStackTrace();
            }

//            // 2
//            for (int i = 0; i < ints.length; i++) {
//                if (ints[i] > max) {
//                    max = ints[i];
//                    number = i;
//                }
//            }
//            resultMap.put(fileName, number);

        }
    }
}


























