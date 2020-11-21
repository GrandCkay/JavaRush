package ua.gfg.javarush.JavaCore.Level5;


/*
Template pattern
*/

public class TemplatePattern {
    public static void main(String[] args) {
        DrinkMaker drinkMaker = new LatteMaker();
        drinkMaker.makeDrink();

        LatteMaker latteMaker = new LatteMaker();
        latteMaker.makeDrink();

        TeaMaker teaMaker = new TeaMaker();
        teaMaker.makeDrink();

        DrinkMaker drinkMaker1 = new TeaMaker();
        drinkMaker1.makeDrink();
    }
}

abstract class DrinkMaker {
    abstract void getRightCup();

    abstract void putIngredient();

    abstract void pour();

    void makeDrink() {
        getRightCup();
        putIngredient();
        pour();
    }
}

class LatteMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }

//    @Override
//    void makeDrink() {
//        super.makeDrink();
//    }
}

class TeaMaker extends DrinkMaker {
    @Override
    void getRightCup() {
        System.out.println("Берем чашку для чая");
    }

    @Override
    void putIngredient() {
        System.out.println("Насыпаем чай");
    }

    @Override
    void pour() {
        System.out.println("Заливаем кипятком");
    }

//    @Override
//    void makeDrink() {
//        super.makeDrink();
//    }
}