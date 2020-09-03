package ua.gfg.javarush.JavaSyntax.Level7;

public class CountDownArrayList {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            //напишите тут ваш код
            Thread.sleep(100);
        }

        System.out.println("Бум!");
    }
}
