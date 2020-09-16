package ua.gfg.javarush.JavaCore.Level1;

public class Min {
    public static void main(String[] args) {
        System.out.println(max(5, 4));
        System.out.println(max(5L, 4L));
        System.out.println(max(5., 4.));
    }

    public static int max(int i, int j) {
        return Math.max(i, j);
    }

    public static long max(long l, long n) {
        return Math.max(l, n);
    }

    public static double max(double d, double b) {
        return Math.max(d, b);
    }

}
