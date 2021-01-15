package ua.gfg.javarush.JavaCore.Level8;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;



// C:\Users\Home\Desktop\1.txt
public class CombiningFiles {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();


        // 5
        FileInputStream inputStreamFirstFile = new FileInputStream(file1);
        FileInputStream inputStreamSecondFile = new FileInputStream(file2);
        byte[] bytesFirst = new byte[inputStreamFirstFile.available()];
        byte[] bytesSecond = new byte[inputStreamSecondFile.available()];

        inputStreamFirstFile.read(bytesFirst);
        inputStreamSecondFile.read(bytesSecond);

        inputStreamFirstFile.close();
        inputStreamSecondFile.close();

        FileOutputStream outputStream = new FileOutputStream(file1);
        outputStream.write(bytesSecond);
        outputStream.write(bytesFirst);
        outputStream.close();





//        // 4
//        FileInputStream inputStreamFirstFile = new FileInputStream(file1);
//        FileInputStream inputStreamSecondFile = new FileInputStream(file2);
//
//        byte[] bytes = new byte[inputStreamFirstFile.available() + inputStreamSecondFile.available()];
//
//        while (inputStreamFirstFile.available() > 0) {
//            inputStreamFirstFile.read(bytes, inputStreamSecondFile.available(), inputStreamFirstFile.available());
//        }
//
//        while (inputStreamSecondFile.available() > 0) {
//            inputStreamSecondFile.read(bytes, 0, inputStreamSecondFile.available());
//        }
//
//        inputStreamFirstFile.close();
//        inputStreamSecondFile.close();
//
//        FileOutputStream outputStream = new FileOutputStream(file1);
//        outputStream.write(bytes, 0, bytes.length);
//        outputStream.close();


//        // 3
//        FileInputStream inputStreamFirstFile = new FileInputStream(file1);
//        byte[] bytes = new byte[inputStreamFirstFile.available()];
//
//        inputStreamFirstFile.read(bytes);
//        inputStreamFirstFile.close();
//
//        FileInputStream inputStreamSecondFile = new FileInputStream(file2);
//        FileOutputStream outputStream = new FileOutputStream(file1);
//
//        while (inputStreamSecondFile.available() > 0) {
//            outputStream.write(inputStreamSecondFile.read());
//        }
//        inputStreamSecondFile.close();
//
//        outputStream.write(bytes);
//
//        outputStream.close();


//        // 2
//        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//        try (FileInputStream fileInputStream1 = new FileInputStream(file1);
//             FileInputStream fileInputStream2 = new FileInputStream(file2)) {
//
//            while (fileInputStream2.available() > 0) {
//                byteArrayOutputStream.write(fileInputStream2.read());
//            }
//            while (fileInputStream1.available() > 0) {
//                byteArrayOutputStream.write(fileInputStream1.read());
//            }
//        }
//        try (FileOutputStream fileOutputStream = new FileOutputStream(file1)) {
//            byteArrayOutputStream.writeTo(fileOutputStream);
//        }


//        // 1
//        ArrayList<Integer> arrayList = new ArrayList<>();
//
//        BufferedReader bufferedReaderFileSecond = new BufferedReader(new FileReader(file2));
//        while (bufferedReaderFileSecond.ready()) {
//            arrayList.add(bufferedReaderFileSecond.read());
//        }
//        bufferedReaderFileSecond.close();
//
//        BufferedReader bufferedReaderFileFirst = new BufferedReader(new FileReader(file1));
//        while (bufferedReaderFileFirst.ready()) {
//            arrayList.add(bufferedReaderFileFirst.read());
//        }
//        bufferedReaderFileFirst.close();
//
//        FileOutputStream fileOutputStream = new FileOutputStream(file1);
//
//        for (Integer integer : arrayList) {
//            fileOutputStream.write(integer);
//        }
//        fileOutputStream.close();

        reader.close();
    }
}
