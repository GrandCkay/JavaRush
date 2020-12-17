package ua.gfg.javarush.JavaCore.Level6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

interface Message {
    void showWarning();
}

public class Clew {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new FourthThread());
        threads.add(new FifthThread());
    }

    public static void main(String[] args) throws InterruptedException {
//        threads.get(0).start();

//        threads.get(1).start();
//        threads.get(1).interrupt();

//        threads.get(2).start();

//        threads.get(3).start();
//        Thread.sleep(1);
//        FourthThread fourthThread = (FourthThread) threads.get(3);
//        fourthThread.showWarning();

//        threads.get(4).start();
    }

    public static class FirstThread extends Thread {
//        // 2
//        public void run() {
//            while (true) {
//            }
//        }


        // 1
        public void run() {
            while (!isInterrupted()) {
                try {
//                    System.out.print("! ");
                    Thread.sleep(400);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class SecondThread extends Thread {
//        // 2
//        public void run() {
//            try {
//                throw new InterruptedException();
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }

        // 1
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThirdThread extends Thread {
        public void run() {
            while (!isInterrupted()) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class FourthThread extends Thread implements Message {
        public void run() {
            while (!isInterrupted()) {
//                System.out.print("? ");
            }
        }

        @Override
        public void showWarning() {
            if (isAlive()) {
                interrupt();
//                System.out.println("\n!!!");
            }
        }
    }

    public static class FifthThread extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int i;

        public void run() {
            try {
                while (true) {
                    if ((s = reader.readLine()).equals(String.valueOf('N'))) {
                        break;
                    }
                    i += Integer.parseInt(s);
                }
                System.out.println(i);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
