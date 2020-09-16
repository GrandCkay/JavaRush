package ua.gfg.javarush.JavaCore.Level1;

public class IntAndInteger {
    public static void main(String[] args) {

        print(1);

        print(new Integer(1));
        print(Integer.valueOf(1));
        print((Integer) 1);
        Integer integer = 1;
        print(integer);
    }

    public static void print(int i) {
        System.out.println(i);
    }

    public static void print(Integer integer) {
        System.out.println(integer);
    }

    public static void print(String s) {
    }

    public static void print(char ch) {
    }

    public static void print(short sh) {
    }

    public static void print(double d) {
    }
}
