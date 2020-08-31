package ua.gfg.javarush.JavaRush.OldLevel;

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //напишите тут ваш код
        double a = Math.pow((x2 - x1), 2);
        double b = Math.pow((y2 - y1), 2);
        return Math.sqrt(a + b);
    }

    public static void main(String[] args) {
        System.out.println(Util.getDistance(2,5,7,8));

    }
}
