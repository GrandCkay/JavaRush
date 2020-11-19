package ua.gfg.javarush.JavaCore.Level5;

public class StaticAndException {
    public static int A = 0;
    public static int B = 5;

    static {
        //throw an exception here - выбросьте эксепшн тут
        if (true) {
            throw new RuntimeException("");
        }
    }

    public static void main(String[] args) {
        System.out.println(B);
    }
}
