package ua.gfg.javarush.JavaSyntax.Level10;

public class MinStatic {
    public static int B = 5;
    public static int C = 5;
    //    public int B = 5;
//    public int C = 5;
    public static int D = 5;
    public int A = 5;

    public static void main(String[] args) {
        MinStatic solution = new MinStatic();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        MinStatic.D = 5 * D * C;
        MinStatic.D = 5;
    }

    public int getA() {
        return A;
    }
}
