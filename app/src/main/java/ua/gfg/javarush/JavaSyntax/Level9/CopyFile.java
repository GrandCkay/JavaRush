package ua.gfg.javarush.JavaSyntax.Level9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();

//        InputStream fileInputStream = getOutputStream(destinationFileName);
//        InputStream fileOutputStream = getOutputStream(destinationFileName);

        InputStream fileInputStream = getInputStream(sourceFileName);
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0) //;
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

    public static InputStream getInputStream(String fileName) throws IOException {
        return new FileInputStream(fileName);
    }

    public static OutputStream getOutputStream(String fileName) throws IOException {
        return new FileOutputStream(fileName);
    }
}
