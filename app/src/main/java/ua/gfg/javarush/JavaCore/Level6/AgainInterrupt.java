package ua.gfg.javarush.JavaCore.Level6;

public class AgainInterrupt {
    public static void main(String[] args) throws InterruptedException {
        TestThread testThread = new TestThread();
        testThread.start();
        testThread.interrupt();
    }

    public static class TestThread extends Thread {
        public void run() {
            System.out.println("1");
        }
    }
}
