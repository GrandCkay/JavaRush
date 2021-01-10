package ua.gfg.javarush.JavaCore.Level8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DownloadException extends Exception {
}

// C:\Users\Home\Desktop\1.txt
class TestSolution {
    public static void main(String[] args) throws IOException, DownloadException {
        while (true) {
            try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {
                if (in.available() < 1000) {
                    throw new DownloadException();
                }
            }
        }

        
    }
}
