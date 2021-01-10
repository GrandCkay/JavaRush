package ua.gfg.javarush.JavaCore.Level8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;


    /*
        Разделение файла: 8 уровень, 5 лекция Java Core
    Считать с консоли три имени файла: файл1, файл2, файл3. Разделить файл1: Первую половину байт записать в файл2,
    вторую половину байт записать в файл3.
    Если в файл1 количество байт нечетное, то файл2 должен содержать большую часть.
    Используй поток FileInputStream, для записи в файлы - FileOutputStream. Закрыть потоки.
     */


// C:\Users\Home\Desktop\1.txt
public class FileSplitting {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
             FileOutputStream out1 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
             FileOutputStream out2 = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {

            // 3
            byte[] bytesSecond = new byte[in.available() / 2];
            byte[] bytesFirst = new byte[in.available() - bytesSecond.length - 1];   // !!!

            System.out.println("Сколько храниться байт в \"блоке (в потоке)\" до записи в буффер (в byte[] bytesFirst) - "
                    + in.available());

            in.read(bytesFirst);
            System.out.println("Сколько осталось байт в \"блоке (в потоке)\" после записи в буффер (в byte[] bytesFirst) - "
                    + in.available());

            out1.write(bytesFirst);

            in.read(bytesSecond);
            System.out.println("Сколько осталось байт в \"блоке (в потоке)\" после записи в буффер (в byte[] bytesSecond) - "
                    + in.available());

            out2.write(bytesSecond);

            in.read(new byte[1]);       // !!!
            System.out.println("Сколько осталось байт в \"блоке (в потоке)\" после записи в буффер (в new byte[]) - "
                    + in.available());

//            // 2
//            int halfOfFile = (in.available() + 1) / 2;
//            int numberOfByte = 0;
//
//            while (in.available() > 0) {
//                if (numberOfByte < halfOfFile) {
//                    out1.write(in.read());
//                    numberOfByte++;
//                } else {
//                    out2.write(in.read());
//                }
//            }

//            // 1
//            byte[] bytes = new byte[in.available()];
//            int count = in.read(bytes);
//            int i = (count % 2 == 0) ? (count / 2) : ((count / 2) + 1);
//
//            out1.write(bytes, 0, i);
//            out2.write(bytes, i, count - i);
        }
    }
}
