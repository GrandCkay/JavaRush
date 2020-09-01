package ua.gfg.javarush.JavaSyntax.OldLevel;

/*
Родственные связи кошек
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FamilyCats {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandDadName = reader.readLine();
        Cat catGrandDad = new Cat(grandDadName);

        String grandMomName = reader.readLine();
        Cat catGrandMom = new Cat(grandMomName);

        String dadName = reader.readLine();
        Cat catDad = new Cat(dadName, catGrandDad, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, null, catGrandMom);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catDad, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catDad, catMother);

        System.out.println(catGrandDad);
        System.out.println(catGrandMom);
        System.out.println(catDad);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }


    public static class Cat {
        private String name;
        private Cat dad;
        private Cat mom;

        public Cat(String name) {
            this.name = name;
            this.dad = null;
            this.mom = null;
        }

        public Cat(String name, Cat dad, Cat mom) {
            this.name = name;
            this.dad = dad;
            this.mom = mom;
        }


        @Override
        public String toString() {
            if (dad == null && mom == null) {
                return "The cat's name is " + name + ", no mother, no father";
            } else if (mom == null) {
                return "The cat's name is " + name + ", no mother, father is " + dad.name;
            } else if (dad == null) {
                return "The cat's name is " + name + ", mother is " + mom.name + ", no father";
            } else {
                return "The cat's name is " + name + ", mother is " + mom.name + ", father is " + dad.name;
            }
        }
    }
}
