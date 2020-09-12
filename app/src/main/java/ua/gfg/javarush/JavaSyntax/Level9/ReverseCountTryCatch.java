package ua.gfg.javarush.JavaSyntax.Level9;

public class ReverseCountTryCatch {
    public static void main(String[] args) {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            //напишите тут ваш код
        }
    }
}
