package ua.gfg.javarush.JavaCore.Level4;

interface Bridge {
    int getCarsCount();
}

public class Bridges {
    public static void main(String[] args) {
        println(new WaterBridge());
        println(new SuspensionBridge());
    }

    //add println method here
    public static void println(Bridge bridge) {
        System.out.println(bridge.getCarsCount());
    }

}

class WaterBridge implements Bridge {
    @Override
    public int getCarsCount() {
        return 10;
    }
}

class SuspensionBridge implements Bridge {
    @Override
    public int getCarsCount() {
        return 20;
    }
}

