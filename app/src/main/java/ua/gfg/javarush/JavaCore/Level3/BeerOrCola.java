package ua.gfg.javarush.JavaCore.Level3;

public class BeerOrCola {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(DrinkLevel3 drinkLevel3) {
        System.out.println(drinkLevel3.getClass().getSimpleName());
    }

    public interface DrinkLevel3 {
        boolean isAlcoholic();
    }

    public static class Beer implements DrinkLevel3 {
        public boolean isAlcoholic() {
            return true;
        }
    }

    public static class Cola implements DrinkLevel3 {
        public boolean isAlcoholic() {
            return false;
        }
    }
}
