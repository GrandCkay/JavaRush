package ua.gfg.javarush.JavaCore.Level8;

// C:\Users\Home\Desktop\1.txt
// mp4

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ByteSort {
    public static void main(String[] args) throws Exception {
//        // 1
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Set<Integer> byteSet = new TreeSet<>();
//
//        try (FileInputStream in = new FileInputStream(reader.readLine())) {
//
//            while (in.available() > 0) {
//                byteSet.add(in.read());
//            }
//        }
//
//        for (Integer aByte : byteSet) {
//            System.out.print(aByte + " ");
//        }


//        // 2
//        boolean[] isRead = new boolean[256];
//
//        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
//            while (in.available() > 0) {
//                isRead[in.read()] = true;
//            }
//
//            for (int i = 0; i < 256; i++) {
//                if (isRead[i]) {
//                    System.out.print(i + " ");
//                }
//            }

        // 3
        int[] array = new int[256];
        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            while (in.available() > 0) {
                array[in.read()]++;
            }
        }

        for (int i = 0; i < 256; i++) {
            if (array[i] != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
