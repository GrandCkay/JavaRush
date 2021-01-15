package ua.gfg.javarush.JavaCore.Level8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;


// C:\Users\Home\Desktop\1.txt
public class TwoAtOne {
    public static void main(String[] args) throws IOException {
        // 2
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine(), true);
             FileInputStream fileInputStream1 = new FileInputStream(reader.readLine());
             FileInputStream fileInputStream2 = new FileInputStream(reader.readLine())) {

            while (fileInputStream1.available() > 0) {
                fileOutputStream.write(fileInputStream1.read());
            }

            while (fileInputStream2.available() > 0) {
                fileOutputStream.write(fileInputStream2.read());
            }
        }

//        // 1
//        try (
//                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//                FileOutputStream out1 = new FileOutputStream(reader.readLine(), true);
//
//                BufferedReader inReader2 = new BufferedReader(new FileReader(reader.readLine()));
//                BufferedReader inReader3 = new BufferedReader(new FileReader(reader.readLine()))) {
//
//            while (inReader2.ready()) {
//                out1.write(inReader2.read());
//            }
//
//            while (inReader3.ready()) {
//                out1.write(inReader3.read());
//            }
//        }
    }
}
