package ua.gfg.javarush.JavaCore.Level5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileInStaticBlock {
    public static List<String> lines = new ArrayList<String>();


    static {
        try {

            // 3
            FileReader fileReader = new FileReader(Statics.FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
            fileReader.close();
//
//            // 1
//            FileInputStream inputStream = new FileInputStream(Statics.FILE_NAME);
//            Scanner scanner = new Scanner(inputStream);
//
//            while (scanner.hasNextLine()) {
//                lines.add(scanner.nextLine());
//            }
//            scanner.close();
//            inputStream.close();
//
//
//            // 2
//            FileInputStream inputStreamFile = new FileInputStream(Statics.FILE_NAME);
//            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStreamFile));
//            String s;
//
//            while ((s = reader.readLine()) != null) {
//                lines.add(s);
//            }
//
//            inputStreamFile.close();
//            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        System.out.println(lines);
    }
}


class Statics {
    /* add the path to your source file here */
    public static String FILE_NAME = "C:\\Users\\Home\\Desktop\\1.txt";


}


