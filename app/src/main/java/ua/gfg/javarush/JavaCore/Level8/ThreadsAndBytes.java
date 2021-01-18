package ua.gfg.javarush.JavaCore.Level8;


/*
Нити и байты
 */


import java.util.HashMap;
import java.util.Map;

// C:\Users\Home\Desktop\1.txt
public class ThreadsAndBytes {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

    }

    public static class ReadThread extends Thread {
        public ReadThread(String fileName) {
            //implement constructor body
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
