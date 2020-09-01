package ua.gfg.javarush.JavaSyntax.OldLevel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class BodyIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {

        public static void calculateMassIndex(double weight, double height) {
            // напишите тут ваш код

            double indexBody = weight / (height * height);
            String formattedDouble = new DecimalFormat("#0.0").format(indexBody);

            if (indexBody < 18.5) {
                System.out.println("Недовес: меньше чем 18.5" + "\nYou body index: " + formattedDouble + " You need to eat");
            } else if (indexBody >= 18.5 && indexBody < 25) {
                System.out.println("Нормальный: между 18.5 и 25" + "\nYou body index: " + formattedDouble + " You have a good body");
            } else if (indexBody >= 25 && indexBody < 30) {
                System.out.println("Избыточный вес: между 25 и 30" + "\nYou body index: " + formattedDouble + " You need sports");
            } else {
                System.out.println("Ожирение: 30 или больше" + "\nYou body index: " + formattedDouble + " Sport is your best friend");
            }
        }
    }
}
