package ua.gfg.javarush.JavaCore.Level6;

import java.util.ArrayList;
import java.util.List;

public class ListAndThreads {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут

        for (int i = 0; i < 5; i++) {
            list.add(new Thread(new SpecialThread()));
//            list.get(i).start();
//            System.out.println(list.get(i).toString());
        }

    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
