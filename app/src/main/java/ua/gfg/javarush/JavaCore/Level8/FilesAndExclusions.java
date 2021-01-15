package ua.gfg.javarush.JavaCore.Level8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;


// C:\Users\Home\Desktop\1.txt
public class FilesAndExclusions {
    public static void main(String[] args) throws IOException {
        // 2
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String fileName = reader.readLine();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {

            } catch (FileNotFoundException e) {
                System.out.println(fileName);
                break;
            }
        }

//        // 1
//        String fileName = "";
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//
//            while (true) {
//                fileName = reader.readLine();
//                new FileInputStream(fileName).close();
//            }
//
//        } catch (FileNotFoundException e) {
//            System.out.println(fileName);
//        }
    }
}
