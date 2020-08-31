package ua.gfg.javarush.JavaRush.OldLevel;

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            result += s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //напишите тут ваш код
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Amigo", 1) + " -> " + multiply("My"));

    }
}
