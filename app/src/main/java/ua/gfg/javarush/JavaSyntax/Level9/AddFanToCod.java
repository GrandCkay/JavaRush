package ua.gfg.javarush.JavaSyntax.Level9;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class AddFanToCod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream fileInputStream = null;
        int count = 0;

        try {
            String sourceFileName = reader.readLine();
            fileInputStream = getInputStream(sourceFileName);
            count = 1;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не существует.");
            count = 0;
        } finally {
            if (count == 0) {
                String sourceFileName = reader.readLine();
                fileInputStream = getInputStream(sourceFileName);
            }
        }

        String destinationFileName = reader.readLine();
        OutputStream fileOutputStream = getOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }


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