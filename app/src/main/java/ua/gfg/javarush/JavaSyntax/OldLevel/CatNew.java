package ua.gfg.javarush.JavaSyntax.OldLevel;


public class CatNew {
    private String name;
    private int age;
    private int weight;
    private int strength;

    public CatNew(String name, int age, int weight, int strength) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public CatNew() {
    }

    public static void main(String[] args) throws Throwable {
        CatNew catNew = new CatNew("Bob", 7, 10, 5);
        CatNew catNew1 = new CatNew("Ron", 8, 3, 8);
        CatNew catNew2 = new CatNew("Josh", 7, 10, 5);
        System.out.println("1.1 " + catNew.fight(catNew1));
        System.out.println("1.2 " + catNew1.fight(catNew2));
        System.out.println("1.3 " + catNew2.fight(catNew));
        System.out.println("2.1 " + catNew.fightJava(catNew1));
        System.out.println("2.2 " + catNew1.fightJava(catNew2));
        System.out.println("2.3 " + catNew2.fightJava(catNew));

        for (int i = 0; i < 50000; i++) {
            CatNew cats = new CatNew();
            cats.finalize();
        }
    }

    public boolean fight(CatNew anotherCatNew) {
        //напишите тут ваш код
        boolean anotherBoolean = false;
        int anotherInt = 0;
        if (this.age > anotherCatNew.age) {
            anotherInt++;
        }
        if (this.weight > anotherCatNew.weight) {
            anotherInt++;
        }
        if (this.strength > anotherCatNew.strength) {
            anotherInt++;
        }
        if (anotherInt >= 2) {
            anotherBoolean = true;
        }
        return anotherBoolean;
    }

    public boolean fightJava(CatNew anotherCatNew) {
        int ageScore = Integer.compare(this.age, anotherCatNew.age);
        int weightScore = Integer.compare(this.weight, anotherCatNew.weight);
        int strengthScore = Integer.compare(this.strength, anotherCatNew.strength);

        int score = ageScore + weightScore + strengthScore;
        return score > 0; // return score > 0 ? true : false;
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A CatNew was destroyed");
    }
}


