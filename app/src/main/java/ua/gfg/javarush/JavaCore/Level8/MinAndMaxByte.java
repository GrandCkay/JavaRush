package ua.gfg.javarush.JavaCore.Level8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


// C:\Users\Home\Desktop\1.txt
public class MinAndMaxByte {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = 255, max = 0;

        try (FileInputStream in = new FileInputStream(reader.readLine())) {
            int[] ints = new int[in.available()];

            while (in.available() > 0) {
                int i = in.read();
                if (min > i) {
                    min = i;
                }
                if (max < i) {
                    max = i;
                }
            }
        }

//        // 1
////        FileInputStream in = new FileInputStream(reader.readLine());
////        while (in.available() > 0) {
////            int i = in.read();
////            if (min > i) {
////                min = i;
////            }
////        }
////        reader.close();
////        in.close();

        System.out.println(max);
        System.out.println(min);

    }
}
