package ua.gfg.javarush.JavaSyntax.OldLevel;

public class NewCat {
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public NewCat(String name) {
        this.name = name;
        this.age = 12;
        this.weight = 6;
        this.color = "Red";
        this.address = null;
    }

    public NewCat(String name, int age) {
        this.name = name;
        this.weight = 10;
        this.age = age;
        this.color = "Blue";
        this.address = null;
    }

    public NewCat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "Blue";
        this.address = null;
    }

    public NewCat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        this.age = 6;
        this.address = null;
        this.name = null;
    }

    public NewCat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.age = 3;
        this.name = null;
    }
}
