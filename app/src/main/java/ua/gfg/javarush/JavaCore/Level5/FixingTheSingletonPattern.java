package ua.gfg.javarush.JavaCore.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Planet {
    static String SUN = "sun";
    static String MOON = "moon";
    static String EARTH = "earth";
}

public class FixingTheSingletonPattern {
    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        try {
            readKeyFromConsoleAndInitPlanet();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(thePlanet.toString());
    }

    public static void readKeyFromConsoleAndInitPlanet() throws IOException {
        // implement step #5 here - реализуйте задание №5 тут

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s.equals(Planet.EARTH)) {
            thePlanet = Earth.getInstance();
        } else if (s.equals(Planet.MOON)) {
            thePlanet = Moon.getInstance();
        } else if (s.equals(Planet.SUN)) {
            thePlanet = Sun.getInstance();
        } else {
            thePlanet = null;
        }
    }
}

class Sun implements Planet {

    // 2
    private static volatile Sun instance;

    private Sun() {
    }

    /*
    Volatile-переменные
    Переменной с ключевым словом volatile означает, что значение этой переменной может изменяться другими потоками.
    В целях повышения производительности спецификация языка Java допускает сохранение в JRE локальной копии
    переменной для каждого потока, который на нее ссылается.

    Synchronized (с англ. "синхронизированный") - это ключевое слово,
    которое позволяет заблокировать доступ к методу или части кода, если его уже использует другой поток.
     */

    public static Sun getInstance() {
        if (instance == null) {
            synchronized (Sun.class) {
                if (instance == null) {
                    instance = new Sun();
                }
            }
        }
        return instance;
    }

//    // 1
//    private static Sun instance;
//
//    private Sun() {
//    }
//
//    public static Sun getInstance() {
//        if (instance == null) {
//            instance = new Sun();
//        }
//            return instance;
//    }
}

class Moon implements Planet {
    private static Moon instance;

    private Moon() {
    }

    public static Moon getInstance() {
        if (instance == null) {
            instance = new Moon();
        }
        return instance;
    }
}

class Earth implements Planet {
    private static Earth instance;

    private Earth() {
    }

    public static Earth getInstance() {
        if (instance == null) {
            instance = new Earth();
        }
        return instance;
    }
}





