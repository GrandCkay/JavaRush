package ua.gfg.javarush.JavaCore.Level6;

public class NotUserInterrupt {
    public static volatile boolean b = true;

    public static void main(String[] args) throws InterruptedException {

        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        b = false;
    }

    public static class TestThread implements Runnable {

        @Override
        public void run() {
            int i = 0;
            while (b) {
                try {
                    System.out.println((i++) + "he-he");
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }
    }
}
