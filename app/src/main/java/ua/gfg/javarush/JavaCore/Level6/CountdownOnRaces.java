package ua.gfg.javarush.JavaCore.Level6;


// "Марш!" "Прервано!"

public class CountdownOnRaces {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут

//            // 2
//            try {
//                while (!isInterrupted() && numSeconds >= 0) {
//                    if (numSeconds == 0) {
//                        System.out.println("Марш!");
//                    } else {
//                        System.out.print(numSeconds + " ");
//                        Thread.sleep(1000);
//                    }
//                    numSeconds--;
//                }
//            } catch (InterruptedException e) {
//                if (numSeconds != -1) {
//                    System.out.println("Прервано!");
//                }
//            }

            // 1
//            Thread thread = Thread.currentThread();
            while (!this.isInterrupted()) {
                try {
                    System.out.print((numSeconds--) + " ");
                    Thread.sleep(1000);
                    if (numSeconds == 0) {
                        System.out.println("Марш!");
                        this.interrupt();
                    }
                } catch (InterruptedException e) {
                    System.out.println("Прервано!");
                    return;
                }
            }
        }
    }
}
