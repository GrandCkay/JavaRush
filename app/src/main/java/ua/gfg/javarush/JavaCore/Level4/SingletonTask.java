package ua.gfg.javarush.JavaCore.Level4;

public class SingletonTask {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

// 4        System.out.println(Singleton.instance);

    }
}

class Singleton {
    // 1    private static Singleton instance;
// 2    private static Singleton instance = new Singleton();
    private static Singleton instance;
// 4    public static final Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
// 1        return Singleton.instance;
// 2, 4        return instance;
        if (instance == null) {
            instance = new Singleton(); // Ленивая инициализация (Lazy Initialization), еще называют отложенной инициализацией
        }
        return instance;
    }
}
