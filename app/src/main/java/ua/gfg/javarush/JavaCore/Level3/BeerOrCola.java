package ua.gfg.javarush.JavaCore.Level3;

public class BeerOrCola {
    public static void main(String[] args) throws Exception {
        print(new Beer());
        print(new Cola());
    }

    private static void print(Drink drink) {
        System.out.println(drink.getClass().getSimpleName());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class Beer implements Drink {
        public boolean isAlcoholic() {
            return true;
        }
    }

    public static class Cola implements Drink {
        public boolean isAlcoholic() {
            return false;
        }
    }
}
