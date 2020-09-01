package ua.gfg.javarush.JavaSyntax.OldLevel;

public class Friend {
    private String name;
    private int age;
    private char sex;

    public Friend(String name) {
        this.name = name;
    }

    public Friend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Friend(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
