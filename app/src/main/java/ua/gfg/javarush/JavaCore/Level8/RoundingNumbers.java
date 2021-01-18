package ua.gfg.javarush.JavaCore.Level8;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

// C:\Users\Home\Desktop\1.txt
public class RoundingNumbers {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String fileNameFirst = "C:\\Users\\Home\\Desktop\\1.txt";
        String fileNameSecond = "C:\\Users\\Home\\Desktop\\2.txt";
//        bufferedReader.close();

//        BufferedReader reader = new BufferedReader(new FileReader(fileNameFirst));
//        String[] strings = reader.readLine().split(" ");
//        reader.close();

        String text = "Hello  World!\nHey! Teachers! Leave them kids alone.";


        BufferedWriter witter = new BufferedWriter(new FileWriter(fileNameSecond));
        witter.write(text);



    }
}
