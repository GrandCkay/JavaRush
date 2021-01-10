package ua.gfg.javarush.JavaCore.Level8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;


// C:\Users\Home\Desktop\1.txt
public class CountingCommas {
    public static void main(String[] args) throws Exception {
        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
            int count = 0, commas = 44;

            while (in.available() > 0) {
                if (in.read() == commas) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
