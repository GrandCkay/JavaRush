package ua.gfg.javarush.JavaSyntax.Level9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MethodTryCatch {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> num = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {
            while (true) {
                String text = reader.readLine();
//                if (text == null || text.isEmpty()) {
//                    break;
//                } else {
                num.add(Integer.parseInt(text));
//                }
            }
        } catch (NumberFormatException e) {
            for (int integer : num) {
                System.out.println(integer);
            }
        } catch (IOException e) {
        }
    }
}
