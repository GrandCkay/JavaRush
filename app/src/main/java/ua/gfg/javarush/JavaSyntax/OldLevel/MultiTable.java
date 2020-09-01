package ua.gfg.javarush.JavaSyntax.OldLevel;

public class MultiTable {
    public static void main(String[] args) {
        int first = 1;
        int second = 1;
        while (first < 11) {
            while (second < 11) {
                System.out.print(first * second + " ");
                second++;
            }
            second = 1;
            first++;
            System.out.println("");
        }
    }
}
