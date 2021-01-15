package ua.gfg.javarush.JavaCore.Level8;

import android.icu.math.BigDecimal;
import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DecimalFormat;

// C:\Users\Home\Desktop\1.txt
public class Spaces {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) throws IOException {
        args = new String[]{"C:\\Users\\Home\\Desktop\\1.txt"};

//        // 2
//        int total = 0, space = 0;
//
//        try (FileReader reader = new FileReader(args[0])) {
//            while (reader.ready()) {
//                int i = reader.read();
//                total++;
//                if (i == (int) ' ') {
//                    space++;
//                }
//            }
//
//            if (total != 0) {
//                double result = (double) space / total * 100;
//                System.out.printf("%.2f", result);
//            }
//        }


        // 1
        int countSpace = 0, lengthFile;

        try (FileInputStream in = new FileInputStream(args[0])) {

            lengthFile = in.available();

            while (in.available() > 0) {
                char ch = (char) in.read();
                if (ch == ' ') {
                    countSpace++;
                }
            }
        }

        double num = ((double) countSpace / lengthFile) * 100;
        System.out.printf("%.2f", num);
//
//
//          // 1.1
//        String stringFormat = new DecimalFormat("#0.00").format(num);
//        System.out.println(stringFormat);
    }
}
