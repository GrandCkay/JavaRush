package ua.gfg.javarush.JavaCore.Level4;

public class DeliciousDrink {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
//        Drink drink = new Wine();
        return new Wine();
    }

    public static Wine getWine() {
        return new Wine();
    }

    public static Wine getBubblyWine() {
        BubblyWine bubblyWine = new BubblyWine();
        return bubblyWine;
    }
}

class BubblyWine extends Wine {
    @Override
    public String getHolidayName() {
        return "Новый Год";
    }
}

class Wine extends Drink {
    public String getHolidayName() {
        return "День Рождения";
    }
}

abstract class Drink {
    public void taste() {
        System.out.println("Вкусно");
    }
}