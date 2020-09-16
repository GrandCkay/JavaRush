package ua.gfg.javarush.JavaCore.Level1;

public class AddAbstract {
    public static void main(String[] args) {
    }
    //add public interfaces and a public class here - добавь public интерфейсы и public класс тут


    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public abstract class Human implements CanRun, CanSwim {
    }
}