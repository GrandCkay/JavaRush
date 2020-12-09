package ua.gfg.javarush.JavaCore.Level6;

import java.util.Date;

public class CreationBySample {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Уменьшаем").start();
        new Thread(new CountUpRunnable(), "Увеличиваем").start();
    }

    public static class CountUpRunnable implements Runnable {
        private int countIndexUp;

        @Override
        public void run() {
            try {
                Date date = new Date();
                long l = System.currentTimeMillis();


                while (true) {
                    ++countIndexUp;
                    System.out.println(toString());
                    Thread.sleep(500);
                    if (countIndexUp == CreationBySample.number) break; // return;
                }

                Date date1 = new Date();
                System.out.println((double) (date1.getTime() - date.getTime()) / 1000 + " seconds");
                long l1 = System.currentTimeMillis();
                System.out.println((double) (l1 - l) / 1000 + " seconds");

            } catch (InterruptedException e) {
            }
        }

        //Add your code here - добавь код тут
        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexUp;
        }
    }

    public static class CountdownRunnable implements Runnable {
        private int countIndexDown = CreationBySample.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countIndexDown -= 1;
                    if (countIndexDown == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countIndexDown;
        }
    }
}
