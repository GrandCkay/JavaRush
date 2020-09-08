package ua.gfg.javarush.JavaSyntax.Level8;

import java.util.ArrayList;


public class HumanFamily {
    public static void main(String[] args) {

//        Human grandDadFather = new Human();
//        Human grandMomFather = new Human();
//        Human grandDadMother = new Human();
//        Human grandMomMother = new Human();
//        Human father = new Human();
//        Human mother = new Human();
//        Human son = new Human();
//        Human sonSmall = new Human();
//        Human daughter = new Human();
//
//        grandDadFather.name = "Grand Dad Father";
//        grandDadFather.sex = true;
//        grandDadFather.age = 67;
//        grandDadFather.children.add(father);
//
//        grandMomFather.name = "Grand Mom Father";
//        grandMomFather.sex = false;
//        grandMomFather.age = 67;
//        grandMomFather.children.add(father);
//
//        grandDadMother.name = "Grand Dad Mother";
//        grandDadMother.sex = true;
//        grandDadMother.age = 65;
//        grandDadMother.children.add(mother);
//
//        grandMomMother.name = "Grand Mom Mother";
//        grandMomMother.sex = false;
//        grandMomMother.age = 65;
//        grandMomMother.children.add(mother);
//
//        father.name = "Father";
//        father.sex = true;
//        father.age = 45;
//        father.children.add(son);
//        father.children.add(sonSmall);
//        father.children.add(daughter);
//
//        mother.name = "Mother";
//        mother.sex = false;
//        mother.age = 40;
//        mother.children.add(son);
//        mother.children.add(sonSmall);
//        mother.children.add(daughter);
//
//        son.name = "Son";
//        son.sex = true;
//        son.age = 19;
//
//        sonSmall.name = "Son Small";
//        sonSmall.sex = true;
//        sonSmall.age = 10;
//
//        daughter.name = "Daughter";
//        daughter.sex = false;
//        daughter.age = 9;

//        System.out.println(grandDadFather.toString());
//        System.out.println(grandMomFather.toString());
//        System.out.println(grandDadMother.toString());
//        System.out.println(grandMomMother.toString());
//        System.out.println(father.toString());
//        System.out.println(mother.toString());
//        System.out.println(son.toString());
//        System.out.println(sonSmall.toString());
//        System.out.println(daughter.toString());

        ArrayList<Human> humans = new ArrayList<>();

        Human grandDadFather = new Human("Grand Dad Father", true, 66);
        humans.add(grandDadFather);

        Human grandMomFather = new Human("Grand Mom Father", false, 63);
        humans.add(grandMomFather);

        Human grandDadMother = new Human("Grand Dad Mother", true, 66);
        humans.add(grandDadMother);

        Human grandMomMother = new Human("Grand Mom Mother", true, 63);
        humans.add(grandMomMother);

        Human father = new Human("Father", true, 46);
        humans.add(father);

        Human mother = new Human("Mother", false, 46);
        humans.add(mother);

        Human son = new Human("Son", true, 16);
        humans.add(son);

        Human sonSmall = new Human("Son Small", true, 6);
        humans.add(sonSmall);

        Human daughter = new Human("Daughter", false, 6);
        humans.add(daughter);

        grandDadFather.children.add(father);
        grandMomFather.children.add(father);

        grandDadMother.children.add(mother);
        grandMomMother.children.add(mother);

        father.children.add(son);
        father.children.add(sonSmall);
        father.children.add(daughter);

        mother.children.add(son);
        mother.children.add(sonSmall);
        mother.children.add(daughter);

        for (Human human : humans) {
            System.out.println(human.toString());
        }


    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
