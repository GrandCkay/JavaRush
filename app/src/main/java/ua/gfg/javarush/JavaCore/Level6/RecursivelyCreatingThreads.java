package ua.gfg.javarush.JavaCore.Level6;

public class RecursivelyCreatingThreads {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        public void run() {
            if (createdThreadCount == count) {
                return;
            } else {
                System.out.println(new GenerateThread());
            }
        }


        @Override
        public String toString() {
            return getName() + " created";
        }
    }
}
