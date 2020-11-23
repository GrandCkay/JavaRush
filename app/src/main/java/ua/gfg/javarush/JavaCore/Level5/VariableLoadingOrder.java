package ua.gfg.javarush.JavaCore.Level5;

public class VariableLoadingOrder {

    static {
        init();
    }

    static {
        System.out.println("Static block");
    }

    public int i = 6;
    public String name = "First name";

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public VariableLoadingOrder() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public static void init() {
        System.out.println("static void init()");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        VariableLoadingOrder s = new VariableLoadingOrder();
    }

    public static void printAllFields(VariableLoadingOrder obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}


















