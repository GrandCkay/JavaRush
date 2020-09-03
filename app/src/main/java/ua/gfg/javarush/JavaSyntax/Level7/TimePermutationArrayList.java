package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class TimePermutationArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();

        //напишите тут ваш код
        int numberN = Integer.parseInt(reader.readLine());
        int numberM = Integer.parseInt(reader.readLine());

        for (int i = 0; i < numberN; i++) {
            arrayList.add(reader.readLine());
        }
//        Collections.rotate(arrayList, - numberM);

        for (int i = 0; i < numberM; i++) {
            arrayList.add(arrayList.remove(0));
//            arrayList.remove(0);
        }


        for (String s1 : arrayList) {
            System.out.println(s1);
        }
    }
}
