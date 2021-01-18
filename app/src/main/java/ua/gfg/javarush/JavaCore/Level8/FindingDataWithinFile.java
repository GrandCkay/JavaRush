package ua.gfg.javarush.JavaCore.Level8;


import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/*
Finding data within a file Поиск данных в файле
 */


// C:\Users\Home\Desktop\1.txt
public class FindingDataWithinFile {
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) throws IOException {
        args = new String[]{"12"};

        // 4
        int count  = Integer.parseInt(args[0]);
        String line = new Scanner(System.in).nextLine();
        BufferedReader bufferedFileReader = new BufferedReader(new FileReader(line));
        String str;
        while ((str = bufferedFileReader.readLine()) != null) {
            if (Integer.parseInt(str.split(" ")[0]) == count) {
                System.out.println(str);
                break;
            }
        }
        bufferedFileReader.close();



//        // 3
//        Scanner scanner = new Scanner(System.in);
//        String fileName = scanner.nextLine();
//        int count  = Integer.parseInt(args[0]);
//        List<String> list = Files.readAllLines(Paths.get(fileName));
//        list.stream().filter(x -> Integer.parseInt(x.split("\\s")[0]) == count).forEach(System.out::println);
//        scanner.close();

//        // 2
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String str;
//        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(reader.readLine()))) {
//            while ((str = bufferedFileReader.readLine()) != null) {
//                if (str.startsWith(args[0] + " ")) {
//                    System.out.println(str);
//                    break;
//                }
//            }
//        }


//        // 1
//        try (FileReader fileReader = new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine());
//             BufferedReader reader = new BufferedReader(fileReader)) {
//
//            String line = "", param = String.valueOf(args[0]) + " ";
//
//            while ((line = reader.readLine()) != null) {
//                if (line.startsWith(param)) {
//                    System.out.println(line);
//                }
//            }
//        }
    }
}
