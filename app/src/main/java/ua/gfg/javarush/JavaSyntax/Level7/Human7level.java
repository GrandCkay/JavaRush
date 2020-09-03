package ua.gfg.javarush.JavaSyntax.Level7;

public class Human7level {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human humanGrandDadFather = new Human("Grand Porshe", true, 60);
        Human humanGrandDadMother = new Human("Grand Skoda", false, 58);
        Human humanGrandMomFather = new Human("Grand Fiat", true, 65);
        Human humanGrandMomMother = new Human("Grand Lada", false, 64);
        Human humanFather = new Human("Bob", true, 40, humanGrandDadFather, humanGrandDadMother);
        Human humanMother = new Human("Sara", false, 37, humanGrandMomFather, humanGrandMomMother);
        Human humanSon = new Human("Si-Jey", true, 16, humanFather, humanMother);
        Human humanDaughter = new Human("Kitty", false, 14, humanFather, humanMother);
        Human humanSonTwo = new Human("Draik", true, 12, humanFather, humanMother);

        System.out.println(humanGrandDadFather);
        System.out.println(humanGrandDadMother);
        System.out.println(humanGrandMomFather);
        System.out.println(humanGrandMomMother);
        System.out.println(humanFather);
        System.out.println(humanMother);
        System.out.println(humanSon);
        System.out.println(humanDaughter);
        System.out.println(humanSonTwo);
    }

    private static class Human {
        // напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        private Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        private Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
