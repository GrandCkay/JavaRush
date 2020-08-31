package ua.gfg.javarush.JavaRush.OldLevel;


public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public Cat(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        boolean anotherBoolean = false;
        int anotherInt = 0;
        if (this.age > anotherCat.age) {
            anotherInt++;
        }
        if (this.weight > anotherCat.weight) {
            anotherInt++;
        }
        if (this.strength > anotherCat.strength) {
            anotherInt++;
        }
        if (anotherInt >= 2) {
            anotherBoolean = true;
        }
        return anotherBoolean;
    }

    public boolean fightJava(Cat anotherCat) {
        int ageScore = Integer.compare(this.age, anotherCat.age);
        int weightScore = Integer.compare(this.weight, anotherCat.weight);
        int strengthScore = Integer.compare(this.strength, anotherCat.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0; // return score > 0 ? true : false;
    }

    public static void main(String[] args) throws Throwable {
        Cat cat = new Cat("Bob",7,10,5);
        Cat cat1 = new Cat("Ron",8,3,8);
        Cat cat2 = new Cat("Josh", 7,10,5);
        System.out.println("1.1 " + cat.fight(cat1));
        System.out.println("1.2 " + cat1.fight(cat2));
        System.out.println("1.3 " + cat2.fight(cat));
        System.out.println("2.1 " + cat.fightJava(cat1));
        System.out.println("2.2 " + cat1.fightJava(cat2));
        System.out.println("2.3 " + cat2.fightJava(cat));

        for (int i = 0; i < 50000; i++) {
            Cat cats = new Cat();
            cats.finalize();
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}


