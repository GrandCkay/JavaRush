package ua.gfg.javarush.JavaSyntax.Level7;

import java.util.ArrayList;

public class ROrLArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");

        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        //напишите тут ваш код

        for (int i = 0; i < strings.size(); i++) {
            int indexR = strings.get(i).indexOf('р');
            int indexL = strings.get(i).indexOf('л');

            if (indexR != -1 && indexL == -1) {
                strings.remove(i);
                i -= 1;
            }
            if (indexR == -1 && indexL != -1) {
                strings.add(i + 1, strings.get(i));
                i += 1;
            }
        }
        return strings;
    }
}
