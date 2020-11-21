package ua.gfg.javarush.JavaCore.Level5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface CanFly {
    void fly();
}

// "helicopter" "plane" Helicopter Plane
public class StaticCaseMedium {
    public static CanFly result;

    static {
        //add your code here - добавьте код тут
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (result instanceof Helicopter) {
            System.out.println(result.getClass().getSimpleName() + " max seven peoples");
        } else if (result instanceof Plane) {
            System.out.println(result.getClass().getSimpleName() + " max " + ((Plane) result).count + " peoples");
        }
    }

    public static void reset() throws IOException {
        //add your code here - добавьте код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        if ((s = reader.readLine()).equals("helicopter")) {
            result = new Helicopter();
        } else if (s.equals("plane")) {
            int i = Integer.parseInt(reader.readLine());
            result = new Plane(i);
        }
        reader.close();
    }
}

class Plane implements CanFly {
    int count;

    public Plane(int count) {
        this.count = count;
    }

    @Override
    public void fly() {
    }
}

class Helicopter implements CanFly {
    @Override
    public void fly() {
    }
}

