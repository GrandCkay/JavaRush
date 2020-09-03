package ua.gfg.javarush.JavaSyntax.Level7;

public class TextStatic {
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {

        TextStatic textStatic = new TextStatic();
        System.out.println(textStatic.getValue());
    }

    public int getValue() {
        return C;
    }
}
