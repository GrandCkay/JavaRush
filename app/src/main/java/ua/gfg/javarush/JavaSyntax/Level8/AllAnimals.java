package ua.gfg.javarush.JavaSyntax.Level8;

import java.util.HashSet;
import java.util.Set;

public class AllAnimals {

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        Set<Cat> result = new HashSet<>();
        //напишите тут ваш код
        for (int i = 0; i < 4; i++) {
            result.add(new Cat());
        }
        return result;
    }

    public static Set<Dog> createDogs() {
        //напишите тут ваш код
        Set<Dog> resultDog = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            resultDog.add(new Dog());
        }
        return resultDog;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //напишите тут ваш код
        Set<Object> allAnimals = new HashSet<>();
        allAnimals.addAll(cats);
        allAnimals.addAll(dogs);
        return allAnimals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //напишите тут ваш код
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //напишите тут ваш код
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }

    //напишите тут ваш код
    public static class Cat {
    }

    public static class Dog {
    }
}


