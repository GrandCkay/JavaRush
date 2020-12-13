package ua.gfg.javarush.JavaCore.Level6;


// *

public class DebugOurUncaughtExceptionHandler {
    public static Thread.UncaughtExceptionHandler handler = new OurUncaughtExceptionHandler();

    public static void main(String[] args) {
        TestedThread commonThread = new TestedThread(handler, "sss");     // !!!

        Thread threadA = new Thread(commonThread, "Нить 1");
        Thread threadB = new Thread(commonThread, "Нить 2");

        // 3
        Thread.setDefaultUncaughtExceptionHandler(handler);

//        // 2
//        threadA.setUncaughtExceptionHandler(handler);
//        threadB.setUncaughtExceptionHandler(handler);

        threadA.start();
        threadB.start();

        threadA.interrupt();
        threadB.interrupt();
    }

    public static class TestedThread extends Thread {
        public TestedThread(UncaughtExceptionHandler handler, String sss) {     // !!!
            super(sss);     // !!!
//            // 1
//            setDefaultUncaughtExceptionHandler(handler);

//            // 2
//            setUncaughtExceptionHandler(handler);
            start();
        }

        public void run() {
            try {
                System.out.println(currentThread().getName());
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException("My exception message");
            }
        }
    }

    public static class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
            System.out.println(t.getName() + ": " + e.getMessage());
        }
    }
}
