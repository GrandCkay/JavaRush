package ua.gfg.javarush.JavaCore.Level8;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


// C:\Users\Home\Desktop\1.txt.part1

public class CreateFile {
    public static void main(String[] args) throws IOException {

//        // 2
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
////        Set<String> files = new TreeSet<>(new Comparator<String>() {
////            @Override
////            public int compare(String o1, String o2) {
////                String[] parts1 = o1.split(".part");
////                String[] parts2 = o2.split(".part");
////                int number1 = Integer.parseInt(parts1[parts1.length - 1]);
////                int number2 = Integer.parseInt(parts2[parts2.length - 1]);
////                return number1 - number2;
////            }
////        });
//
//        Set<String> files = new TreeSet<>();
//
//        String outputFile = null;
//        String readString;
//        while (!(readString = reader.readLine()).equals("end")) {
//            files.add(readString);
//            if (outputFile == null) {
//                int indexOfSuffix = readString.lastIndexOf(".part");
//                outputFile = readString.substring(0, indexOfSuffix);
//            }
//        }
//
//        if (outputFile == null) return;
//        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
//            for (String file : files) {
//                try (FileInputStream fileInputStream = new FileInputStream(file)) {
//                    byte[] buffer = new byte[fileInputStream.available()];
//                    while (fileInputStream.available() > 0) {
//                        int bytesRead = fileInputStream.read(buffer);
//                        fileOutputStream.write(buffer, 0, bytesRead);
//                    }
//                }
//            }
//        }




        // 1
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            String fileNameIn, fileNameOut = "";
            Set<String> set = new TreeSet<>();

            while (!(fileNameIn = bufferedReader.readLine()).equals("end")) {
                fileNameOut = fileNameIn.substring(0, fileNameIn.lastIndexOf("."));
                set.add(fileNameIn);

            }

            BufferedWriter out = new BufferedWriter(new FileWriter(fileNameOut, true));
            BufferedReader in;

            for (String s : set) {
                in = new BufferedReader(new FileReader(s));
                while (in.ready()) {
                    out.write(in.read());
                }
                in.close();
            }
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
