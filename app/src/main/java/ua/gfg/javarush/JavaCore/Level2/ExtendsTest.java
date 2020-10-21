package ua.gfg.javarush.JavaCore.Level2;

import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

import java.util.HashMap;

public class ExtendsTest {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static String getObjectType(Object o) {
        //напишите тут ваш код   "Бык" "Кот" "Лев" "Тигр"
//        return o.toString();

//        // 3
//        HashMap<Class, String> map = new HashMap<>();
//        map.put(Cat.class, "Кот");
//        map.put(Tiger.class, "Тигр");
//        map.put(Lion.class, "Лев");
//        map.put(Bull.class, "Бык");
//
//        return map.getOrDefault(o.getClass(), "Животное");

        // 2
        HashMap<String, String> map = new HashMap<>();
        map.put("Cat", "Кот");
        map.put("Tiger", "Тигр");
        map.put("Lion", "Лев");
        map.put("Bull", "Бык");

        String nameO = o.getClass().getSimpleName();
        if (map.get(nameO) != null) {
            return map.get(nameO);
        } else {
            return "Животное";
        }

//        // 1
//        if (o instanceof Cat) {
//            return "Кот";
//        } else if (o instanceof Tiger) {
//            return "Тигр";
//        } else if (o instanceof Lion) {
//            return "Лев";
//        } else if (o instanceof Bull) {
//            return "Бык";
//        } else {
//            return "Животное";
//        }
    }

    public static class Cat {
        @NonNull
        @Override
        public String toString() {
            return "Кот";
        }
    }

    public static class Tiger {
        @NonNull
        @Override
        public String toString() {
            return "Тигр";
        }
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
