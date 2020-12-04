package ua.gfg.javarush.JavaCore.Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSecond {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();

        reader.readLine();
        stopwatch.interrupt();

        reader.close();
        in.close();
    }

    public static class Stopwatch extends Thread {
        private int seconds;

        public void run() {
            Thread thread = Thread.currentThread();
            try {
                // 2
                while (!thread.isInterrupted()) {
                    seconds++;
                    Thread.sleep(1000);
                }

//                // 1
//                for (int i = 0; i < Integer.MAX_VALUE; i++) {
//                    seconds = i;
//                    Thread.sleep(1000);
//                }

            } catch (InterruptedException e) {
                System.out.println(seconds);
            }
        }
    }
}
