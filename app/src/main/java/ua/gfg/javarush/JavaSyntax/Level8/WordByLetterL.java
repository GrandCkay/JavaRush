package ua.gfg.javarush.JavaSyntax.Level8;

import java.util.HashSet;
import java.util.Set;

public class WordByLetterL {
    public static Set<String> createSet() {
        Set<String> stringSet = new HashSet<>();
        String s = "Л";
        for (int i = 0; i < 20; i++) {
            stringSet.add(s + i);
        }
        return stringSet;
    }

    public static void main(String[] args) {
        Set<String> set = createSet();
        for (String s : set) {
            System.out.println(s);
        }
    }
}
