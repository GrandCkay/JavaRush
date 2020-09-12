package ua.gfg.javarush.JavaSyntax.Level9;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero() {
        int a = 5 / 0;
        System.out.println(a);
    }
}
