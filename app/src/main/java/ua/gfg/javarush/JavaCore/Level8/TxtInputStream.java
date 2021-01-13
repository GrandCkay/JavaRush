package ua.gfg.javarush.JavaCore.Level8;

import java.io.FileInputStream;
import java.io.IOException;

// C:\Users\Home\Desktop\1.txt

public class TxtInputStream extends FileInputStream {
    private FileInputStream fileInputStream;

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);

//        // 1
//        int index = fileName.lastIndexOf(".");
//        String s = fileName.substring(index + 1);
//        if (!s.equals("txt")) {

//        //2
//        if (!fileName.endsWith(".txt")) {

        // 3
        if (!fileName.matches(".+\\.(txt)")) {
            super.close();
            throw new UnsupportedFileNameException();
        } else {
            System.out.println("Ok");
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        TxtInputStream txt = new TxtInputStream("C:\\Users\\Home\\Desktop\\1.txt");
    }
}

class UnsupportedFileNameException extends Exception {
}