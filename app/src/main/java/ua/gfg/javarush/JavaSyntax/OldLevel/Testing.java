package ua.gfg.javarush.JavaSyntax.OldLevel;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Testing {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

            int number = Integer.parseInt(reader.readLine());
            if (number > 0) {
                while (number > 0) {
                    int j = Integer.parseInt(reader.readLine());
                    maximum = (j >= maximum) ? j : maximum;
                    number--;
                    if (number == 0) {
                        break;
                    }
                }
                System.out.println(maximum);
        }
    }
}

