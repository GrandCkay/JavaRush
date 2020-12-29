package ua.gfg.javarush.JavaCore.Level7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

enum Sex {
    MALE,
    FEMALE
}

public class CrUD {
    public static List<Person> allPeople = new ArrayList<Person>();
    public static SimpleDateFormat simpleDateFormatCreate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat simpleDateFormatInfo = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }


    // "-c" "-d" "-i" "-u"
    public static void main(String[] args) throws ParseException {
        //start here - начни тут

//        args = new String[]{"-i", "1"};

        switch (args[0]) {
            case "-c":          // -c name sex bd
                create(args);
                break;
            case "-u":          // -u id name sex bd
                update(args);
                break;
            case "-d":          // -d id
                delete(Integer.parseInt(args[1]));
                break;
            case "-i":          // -i id
                info(Integer.parseInt(args[1]));
                break;
        }
    }

    public static void create(String[] strings) throws ParseException {
        // 1.1
        String name = strings[1];
        String stringSex = strings[2];
        Date date = simpleDateFormatCreate.parse(strings[3]);


        if (stringSex.equals("м")) {
            allPeople.add(Person.createMale(name, date));
        } else {
            allPeople.add(Person.createFemale(name, date));
        }

//        // 1
//        if (strings[2].equals("м")) {
//            allPeople.add(Person.createMale(strings[1], simpleDateFormatCreate.parse(strings[3])));
//        } else {
//            allPeople.add(Person.createFemale(strings[1], simpleDateFormatCreate.parse(strings[3])));
//        }


        System.out.println(allPeople.size() - 1);
    }

    public static void update(String[] strings) throws ParseException {
        // 1.1
        int index = Integer.parseInt(strings[1]);
        Sex sex = strings[3].equals("м") ? Sex.MALE : Sex.FEMALE;
        String name = strings[2];
        Date date = simpleDateFormatCreate.parse(strings[4]);

        allPeople.get(index).setSex(sex);
        allPeople.get(index).setName(name);
        allPeople.get(index).setBirthDate(date);


//        //1
//        allPeople.get(Integer.parseInt(strings[1])).setSex((strings[3].equals("м")) ? Sex.MALE : Sex.FEMALE);
//        allPeople.get(Integer.parseInt(strings[1])).setName(strings[2]);
//        allPeople.get(Integer.parseInt(strings[1])).setBirthDate(simpleDateFormatCreate.parse(strings[4]));
    }


    public static void delete(int i) {
        allPeople.get(i).setName(null);
        allPeople.get(i).setSex(null);
        allPeople.get(i).setBirthDate(null);
    }


    // "м" "ж"
    public static void info(int i) {
        String s = (allPeople.get(i).getSex().equals(Sex.MALE)) ? "м" : "ж";

        System.out.println(allPeople.get(i).getName() + " " + s + " "
                + simpleDateFormatInfo.format(allPeople.get(i).getBirthDate()));
    }
}

class Person {
    private String name;
    private Sex sex;
    private Date birthDate;

    private Person(String name, Sex sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person createMale(String name, Date birthDate) {
        return new Person(name, Sex.MALE, birthDate);
    }

    public static Person createFemale(String name, Date birthDate) {
        return new Person(name, Sex.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}


