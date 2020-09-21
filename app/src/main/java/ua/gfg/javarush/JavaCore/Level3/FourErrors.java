package ua.gfg.javarush.JavaCore.Level3;

public class FourErrors {
    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString());     // new Dream()
        System.out.println(new Hobby().toString());

    }

    interface Desire {
    }

    interface Dream {
        public static Hobby HOBBY = new Hobby();   //  private
    }

    static class Hobby implements Desire, Dream {  // not static // extends Desire
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
