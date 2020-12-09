package ua.gfg.javarush.JavaCore.Level6;

import java.util.ArrayList;
import java.util.List;

public class LetsPlay {
    public static void main(String[] args) {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("Начало игры");
            steps.add("Сбор ресурсов");
            steps.add("Рост экономики");
            steps.add("Убийство врагов");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 1);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 1);


        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {
            //Add your code here - добавь код тут

            // 2
            int i = 0;
            try {
                while (i < OnlineGame.steps.size()) {
                    System.out.println(getName() + ":" + OnlineGame.steps.get(i));
                    i++;
                    Thread.sleep(1000 / rating);
                }
                if (!OnlineGame.isWinnerFound) {
                    OnlineGame.isWinnerFound = true;
                    System.out.println(getName() + ":победитель!");
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + ":проиграл");
            }


//            // 1.1
//            try {
//                for (String s : OnlineGame.steps) {
//                    System.out.println(getName() + ":" + s);
//                    Thread.sleep(1000 / rating);
//                }
//                System.out.println(getName() + ":победитель!");
//                OnlineGame.isWinnerFound = true;
//            } catch (InterruptedException e) {
//                System.out.println(getName() + ":проиграл");
//            }


//            // 1
//            try {
//                while (!OnlineGame.isWinnerFound) {
//                    for (String s : OnlineGame.steps) {
//                        System.out.println(this.getName() + ":" + s);
//                            Thread.sleep(1000 / rating);
//                        if (s.equals(OnlineGame.steps.get(OnlineGame.steps.size() - 1))) {
//                            System.out.println(this.getName() + ":победитель!");
//                            OnlineGame.isWinnerFound = true;
//                        }
//                    }
//                }
//            } catch (InterruptedException e) {
//                System.out.println(this.getName() + ":проиграл");
//            }
        }
    }
}
