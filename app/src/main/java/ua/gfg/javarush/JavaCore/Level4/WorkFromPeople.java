package ua.gfg.javarush.JavaCore.Level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//  "coder" "loser" "proger" "user"

interface Person {
    class User implements Person {
        void live() {
            System.out.println("I usually just live.");
        }
    }

    class Loser implements Person {
        void doNothing() {
            System.out.println("I usually do nothing.");
        }
    }

    class Coder implements Person {
        void writeCode() {
            System.out.println("I usually write code.");
        }
    }


    class Proger implements Person {
        void enjoy() {
            System.out.println("It's a wonderful life!");
        }
    }
}

public class WorkFromPeople {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        String[] keysArray = {"coder", "loser", "proger", "user"};

//        //тут цикл по чтению ключей, пункт 1
        // 4
//        while (Arrays.asList(keysArray).contains(key = reader.readLine())) {
//            String className = key.substring(0, 1).toUpperCase() + key.substring(1);
//            Class aClass = Class.forName("ua.gfg.javarush.JavaCore.Level4.Person$" + className);
//
//            //создаем объект, пункт 2
//            person = (Person) aClass.getConstructor().newInstance();
//
//            doWork(person); //вызываем doWork
//        }

        // 3
//        while (Arrays.asList(keysArray).contains(key = reader.readLine())) {
//            if (key.equalsIgnoreCase(Person.Loser.class.getSimpleName())) {
//                person = new Person.Loser();
//            } else if (key.equalsIgnoreCase(Person.User.class.getSimpleName())) {
//                person = new Person.Loser();
//            } else if (key.equalsIgnoreCase(Person.Coder.class.getSimpleName())) {
//                person = new Person.Loser();
//            } else if (key.equalsIgnoreCase(Person.Proger.class.getSimpleName())) {
//                person = new Person.Loser();
//            }
//            doWork(person); //вызываем doWork
//        }

        // 2
//        while (true) {
//            key = reader.readLine();
//            boolean b = Arrays.asList(keysArray).contains(key);
//            if (!b) break;
//
//            //создаем объект, пункт 2
//            switch (key) {
//                case "coder":
//                    person = new Person.Coder();
//                    break;
//                case "loser":
//                    person = new Person.Loser();
//                    break;
//                case "proger":
//                    person = new Person.Proger();
//                    break;
//                case "user":
//                    person = new Person.User();
//                    break;
//                default:
//                    throw new IllegalStateException("Unexpected value: " + key);
//            }
//            doWork(person); //вызываем doWork
//        }

        // 1.1
        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
            //создаем объект, пункт 2
            if (key.equals("coder")) {
                person = new Person.Coder();
                doWork(person); //вызываем doWork
            } else if (key.equals("loser")) {
                person = new Person.Loser();
                doWork(person); //вызываем doWork
            } else if (key.equals("proger")) {
                person = new Person.Proger();
                doWork(person); //вызываем doWork
            } else if (key.equals("user")) {
                person = new Person.User();
                doWork(person); //вызываем doWork
            } else {
                break;
            }
        }


        // 1
//        ArrayList<String> arrayList = new ArrayList<>();
//        //тут цикл по чтению ключей, пункт 1
//        while (true) {
//            key = reader.readLine();
//            if (Arrays.asList(keysArray).contains(key)) {
//                arrayList.add(key);
//            } else {
//                break;
//            }
//        }
//
//        {
//            //создаем объект, пункт 2
//            for (String item : arrayList) {
//                if (item.equals("coder")) {
//                    person = new Person.Coder();
//                } else if (item.equals("loser")) {
//                    person = new Person.Loser();
//                } else if (item.equals("proger")) {
//                    person = new Person.Proger();
//                } else if (item.equals("user")) {
//                    person = new Person.User();
//                }
//                doWork(person); //вызываем doWork
//            }
//        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}