package ua.gfg.javarush.JavaSyntax.Level9;

public class AllTryCatchException {
    public static void main(String[] args) {

    }

    static class MyException extends Exception {
    }

    static class MyException2 extends Exception {
    }

    static class MyException3 extends RuntimeException {
    }

    static class MyException4 extends MyException3 {
    }
}
