package ua.gfg.javarush.JavaCore.Level8;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;


/*
Округление чисел
*/

// C:\Users\Home\Desktop\1.txt
public class RoundingNumbers {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) throws IOException {

//        // 2
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        FileInputStream inputStream = new FileInputStream(bufferedReader.readLine());
//        byte[] bytes = new byte[inputStream.available()];
//
//        inputStream.read(bytes);
//        inputStream.close();
//
//        String result = Arrays.stream(new String(bytes).split("\\s+"))
//                .map(value -> String.valueOf(Math.round(Double.parseDouble(value))))
//                .collect(Collectors.joining(" "));
//
//        FileOutputStream outputStream = new FileOutputStream(bufferedReader.readLine());
//        outputStream.write(result.getBytes());
//
//        outputStream.close();
//        bufferedReader.close();

        // 1
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));
             BufferedWriter witter = new BufferedWriter(new FileWriter(bufferedReader.readLine()))) {

            String[] strings = reader.readLine().split(" ");


            for (String s : strings) {
                witter.write(Math.round(Double.parseDouble(s)) + " ");
            }
        }
    }
}
