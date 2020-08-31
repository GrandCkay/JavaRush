package ua.gfg.javarush.JavaRush.OldLevel;

import java.util.ArrayList;

public class CatList {

    public static ArrayList<CatList> cats = new ArrayList<>();

    public CatList() {
    }

    public static void main(String[] args) {
        int count = 10;

        for (int i = 0; i < count; i++) {
            CatList catList = new CatList();
            cats.add(catList);
        }
        printCat();
    }

    public static void printCat() {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(i + 1 + " " + cats.get(i));
        }
    }
}
