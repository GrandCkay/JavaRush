package ua.gfg.javarush.JavaCore.Level8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// C:\Users\Home\Desktop\1.txt
public class Encryption {
    public static void main(String[] args) throws IOException {
//        args = new String[]{"-e", "C:\\Users\\Home\\Desktop\\1.txt", "C:\\Users\\Home\\Desktop\\2.txt"};
//        args = new String[]{"-d", "C:\\Users\\Home\\Desktop\\2.txt", "C:\\Users\\Home\\Desktop\\3.txt"};

        // 2
        String mode = args[0];
        if (!(mode.equals("-e") || mode.equals("-d"))) return;
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            if (mode.equals("-e")) {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() + 32);
                }
            } else {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() - 32);
                }
            }
        }

//        // 1
//        switch (args[0]) {
//            case "-e":
//                encryption(args[1], args[2], 7);
//                break;
//            case "-d":
//                encryption(args[1], args[2], -7);
//                break;
//        }
//    }
//
//    public static void encryption(String fileName, String fileOut, int key) {
//        try (FileInputStream in = new FileInputStream(fileName);
//             FileOutputStream out = new FileOutputStream(fileOut)) {
//
//            while (in.available() > 0) {
//                int i = in.read() + key;
//                out.write(i);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
