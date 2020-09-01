package ua.gfg.javarush.JavaSyntax.OldLevel;

public class Cats {
    public static void main(String[] args) {
        // Создай 10 котов
        for (int i = 0; i < 10; i++) {
            CatClass cats = new CatClass();
        }

        // Выведи значение переменной catCount
        System.out.println(CatClass.catCount);
    }

    public static class CatClass {
        // Создай статическую переменную catCount
        public static int catCount;

        // Создай конструктор

        public CatClass() {
            catCount++;
        }
    }
}
