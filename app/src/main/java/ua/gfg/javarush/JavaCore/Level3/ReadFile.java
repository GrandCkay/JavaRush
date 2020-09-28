package ua.gfg.javarush.JavaCore.Level3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {  //   C:\Users\Home\Desktop\1.txt
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(reader.readLine()));

        InputStream inputStream = new FileInputStream(reader.readLine());

        while (inputStream.available() > 0) {
            char date = (char) inputStream.read();
            System.out.print(date);
        }
        inputStream.close();
        reader.close();
    }
}
