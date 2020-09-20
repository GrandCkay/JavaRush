package ua.gfg.javarush.JavaCore.Level2;

public class Extends {


    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class CTO extends Boss implements Businessman {

    }

    public static class Boss {
        public void workHard() {
        }
    }
}
