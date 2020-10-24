package ua.gfg.javarush.JavaCore.Level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteInFile {   //   C:\Users\Home\Desktop\1.txt
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

//        // 1
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
//
//        ArrayList<String> arrayList = new ArrayList<>();
//        boolean isRead = true;
//
//        while (isRead) {
//            String line = reader.readLine();
//            arrayList.add(line);
//            switch (line) {
//                case "exit":
//                    isRead = false;
//                    reader.close();
//                    break;
//            }
//        }
//
//        for (String s : arrayList) {
//            writer.write(s + "\n");
//        }
//        writer.close();


//        // 2
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()))) {
//
//                while (true) {
//                    String line = reader.readLine();
//                    writer.write(line + System.lineSeparator());
//                    if (line.equalsIgnoreCase("exit")) {
//                        reader.close();
//                        writer.close();
//                        break;
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        // 3
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        StringBuilder builder = new StringBuilder();

        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            builder.append(s).append("\n");
        }

        writer.write(builder.toString());
        writer.close();
    }
}
