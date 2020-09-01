package ua.gfg.javarush.JavaSyntax.OldLevel;

public class Triangle {
    public static void main(String[] args) {
        String x = "#";
            for (int i = 1; i < 11; i++) {
                    System.out.println(x);
                    x = x + "#";
                }

        for (int i = 1; i < 11; i++) {
                for (int j = 0; j < i; j++) {
            System.out.print(8);
        }
                System.out.println();
        }

    }
}
