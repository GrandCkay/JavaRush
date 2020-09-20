package ua.gfg.javarush.JavaCore.Level1;

public class Animal {
    public Animal() {
        System.out.println("Animal con not par");
    }

    public Animal(String s) {
        System.out.println("Animal con / par  + " + s);
    }

    protected void voice() {    // public
        System.out.println("Voice!");
    }

    public Animal getNewAnimal() {
        return new Animal();
    }
}

class main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Animal bear = new Bear();
//        Bear bear = new Animal(); // error
        Animal dog = new Dog();
        Animal dog1 = new Dog("NEW");
        Dog dog2 = new Dog();

        animal.voice();
        System.out.println();

        cat.voice();
        System.out.println();

        bear.voice();
        System.out.println();

        dog.voice();
    }
}

class Cat extends Animal {
    @Override
    public void voice() {
        super.voice();
        System.out.println("Cat");
    }

    @Override
    public Animal getNewAnimal() {
        return new Cat();
    }
}

class Bear extends Animal {
    @Override
    public void voice() {
//        this.voice();  error
        System.out.println("Beeeear");
    }
}

class Dog extends Animal {
    public Dog() {
        super("Dog con not par");
    }

    public Dog(String s) {
        this();
        System.out.println(" + Dog con / par + " + s);
    }

    @Override
    public void voice() {
        System.out.println("Doooog");
    }
}
