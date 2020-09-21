package ua.gfg.javarush.JavaCore.Level3;

public class ScreenObject {
    public static void main(String[] args) {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {

        public SimpleObject<String> getInstance() {
            return new StringObject();
        }
    }

}
