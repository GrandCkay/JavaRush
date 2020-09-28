package ua.gfg.javarush.JavaCore.Level3;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

public class FoxAndBigFox {
    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox();
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public static class BigFox extends Fox {
        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        public Color getColor() {
            return null;
        }
    }
}
