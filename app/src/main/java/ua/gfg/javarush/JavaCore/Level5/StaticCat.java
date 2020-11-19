package ua.gfg.javarush.JavaCore.Level5;

public class StaticCat {
    private static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Tom";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {
    }

    private static class Cat {
        public String name;
    }
}
