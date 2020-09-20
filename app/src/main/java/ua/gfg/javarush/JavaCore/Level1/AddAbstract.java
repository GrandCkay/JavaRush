package ua.gfg.javarush.JavaCore.Level1;

public class AddAbstract {
    public static void main(String[] args) {
        CanRun man = new Man();
        man.on();
    }

    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут

    public interface CanRun {
        void run();

        default void on() {
            System.out.println("CanRun on");
        }
    }


    public interface CanSwim {
        public void swim();

        default void on() {
            System.out.println("CarSwim on");
        }
    }

    public static class Man implements CanRun, CanSwim {

        @Override
        public void on() {
            System.out.println("Man on");
        }

        @Override
        public void run() {
        }

        @Override
        public void swim() {
        }
    }

    public abstract class Human implements CanRun, CanSwim {

        @Override
        public void run() {
        }

        @Override
        public void on() {
        }

        @Override
        public void swim() {
        }
    }
}