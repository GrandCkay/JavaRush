package ua.gfg.javarush.JavaSyntax.Level9;

public class ReversStatic {
//    public int A = 5;
//    public int B = 2 * A;
//    public int C = A * B;
//    public int D = A * B;

    public static int A = 5;
    public static int B = 2 * A;
    public static int D = A * B;
    public int C = A * B;

    public static void main(String[] args) {
        ReversStatic room = new ReversStatic();
        room.A = 5;
        ReversStatic.D = 5;
    }

    public int getA() {
        return A;
    }
}
