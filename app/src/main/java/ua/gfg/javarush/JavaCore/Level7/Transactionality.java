package ua.gfg.javarush.JavaCore.Level7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// C:\Users\Home\Desktop\1.txt      all
// C:\Users\Home\Desktop\2.txt      for

public class Transactionality {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line1, line2;

//        // 1
//        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
//        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));

        // 2
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(reader.readLine()));


        while ((line1 = bufferedReader1.readLine()) != null) {
            allLines.add(line1);
        }

        while ((line2 = bufferedReader2.readLine()) != null) {
            forRemoveLines.add(line2);
        }

        try {
            new Transactionality().joinData();      // new Solution().joinData;
        } catch (CorruptedDataException e) {
            e.printStackTrace();
        }

        reader.close();
        bufferedReader1.close();
        bufferedReader2.close();
    }


    public void joinData() throws CorruptedDataException {

//        // 3
//        for (String s : forRemoveLines) {
//            if (allLines.contains(s)) {
//                allLines.remove(s);
//            } else {
//                allLines.clear();
//                throw new CorruptedDataException();
//            }
//        }

        // 2
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }

//        // 1
//        int i = 0;
//
//        for (String forRemoveLine : forRemoveLines) {
//            if (allLines.contains(forRemoveLine)) {
//                i++;
//            }
//        }
//
//        if (i == forRemoveLines.size()) {
//            allLines.removeAll(forRemoveLines);
//        } else {
//            allLines.clear();
//            throw new CorruptedDataException();
//        }
    }
}


class CorruptedDataException extends IOException {
}
