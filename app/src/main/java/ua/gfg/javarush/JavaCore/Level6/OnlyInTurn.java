package ua.gfg.javarush.JavaCore.Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OnlyInTurn {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        StringBuilder stringBuilder = new StringBuilder();
        int count;


        @Override
        public void run() {

            try {
                System.out.println("Please enter the number of lines");
                count = Integer.parseInt(reader.readLine());

                System.out.println("Please insert the string");
                for (int i = 0; i < count; i++) {
                    stringBuilder.append(reader.readLine());
                    if (i < (count - 1)) {
                        stringBuilder.append(" ");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(stringBuilder);

        }
    }
}
