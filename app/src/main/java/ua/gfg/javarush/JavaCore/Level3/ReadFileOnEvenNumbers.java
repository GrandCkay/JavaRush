package ua.gfg.javarush.JavaCore.Level3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReadFileOnEvenNumbers {
    public static void main(String[] args) {
        // напишите тут ваш код              C:\Users\Home\Desktop\1.txt
        ArrayList<Integer> arrayList = new ArrayList<>();

        try {
            BufferedReader readerNameFile = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream fileInputStream = new FileInputStream(readerNameFile.readLine().trim());

            // 2
            Scanner scanner = new Scanner(fileInputStream);
            while (scanner.hasNextLine()) {
                arrayList.add(Integer.parseInt(scanner.nextLine()));
            }
            fileInputStream.close();
            scanner.close();

//            // 1
//            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
//            String s;
//            while ((s = reader.readLine()) != null) {
//                arrayList.add(Integer.parseInt(s));
//            }
//            reader.close();

            readerNameFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Collections.sort(arrayList);

        for (Integer integer : arrayList) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }
    }
}
