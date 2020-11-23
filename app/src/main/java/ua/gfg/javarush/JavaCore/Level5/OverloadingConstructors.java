package ua.gfg.javarush.JavaCore.Level5;

public class OverloadingConstructors {
    private OverloadingConstructors(int i) {
    }

    OverloadingConstructors() {
    }

    protected OverloadingConstructors(Object o) {
    }

    public OverloadingConstructors(String s) {
    }

    public static void main(String[] args) {
    }
}

class SubSolution extends OverloadingConstructors {
    public SubSolution() {
    }

    SubSolution(Object o) {
        super(o);
    }

    protected SubSolution(String s) {
        super(s);
    }
}
