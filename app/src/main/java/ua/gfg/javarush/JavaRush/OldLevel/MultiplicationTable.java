package ua.gfg.javarush.JavaRush.OldLevel;

public class MultiplicationTable {
    public static void main(String[] args) {
        int sum2 = 0, sum3 = 0, sum4 = 0, sum5 = 0, sum6 = 0;
        int sum7 = 0, sum8 = 0, sum9 = 0, sum10 = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            sum2 += 2;
            System.out.print(sum2 + " ");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            sum3 += 3;
            System.out.print(sum3 + " ");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            sum4 += 4;
            System.out.print(sum4 + " ");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            sum5 += 5;
            System.out.print(sum5 + " ");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            sum6 += 6;
            System.out.print(sum6 + " ");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            sum7 += 7;
            System.out.print(sum7 + " ");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            sum8 += 8;
            System.out.print(sum8 + " ");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            sum9 += 9;
            System.out.print(sum9 + " ");
        }
        System.out.print("\n");

        for (int i = 1; i <= 10; i++) {
            sum10 += 10;
            System.out.print(sum10 + " ");
        }
        System.out.print("\n");


        // Second method
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println("");
        }
    }
}
