package ua.gfg.javarush.JavaCore.Level7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

// 0   1    2    3   4     5    6      7     8    9   10    11   12
// -c name1 sex1 bd1 name2 sex2 bd2 ...name1 sex1 bd1 name2 sex2 bd2

// 0   1    2    3   4     5    6   7    8      9   10    11   12  13   14   15  16
// -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...id1 name1 sex1 bd1 id2 name2 sex2 bd

// -d id1 id2 id3 id4 ...
// -i id1 id2 id3 id4 ...

enum Sex1 {
    MALE,
    FEMALE
}

public class CrUD2 {
    public static volatile List<Person2> allPeople = new ArrayList<Person2>();
    public static SimpleDateFormat simpleDateFormatCreate = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat simpleDateFormatInfo = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);


    static {
        allPeople.add(Person2.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person2.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
        allPeople.add(Person2.createMale("Иван", new Date()));  //сегодня родился    id=2
        allPeople.add(Person2.createMale("Петр", new Date()));  //сегодня родился    id=3
    }

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        switch (args[0]) {                       // 0   1    2    3   4     5    6      7     8    9   10    11   12
            case "-c":                          // -c name1 sex1 bd1 name2 sex2 bd2 ...name1 sex1 bd1 name2 sex2 bd2
                synchronized (allPeople) {
                    create(args);
                }
                break;                          // 0   1    2    3   4     5    6   7    8      9   10    11   12  13   14   15  16
            case "-u":                          // -u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...id1 name1 sex1 bd1 id2 name2 sex2 bd
                synchronized (allPeople) {
                    update(args);
                }
                break;
            case "-d":                          // -d id1 id2 id3 id4 ...
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        delete(Integer.parseInt(args[i]));
                    }
                }
                break;
            case "-i":                          // -i id1 id2 id3 id4 ...
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        info(Integer.parseInt(args[i]));
                    }
                }
                break;
        }
    }

    public static void create(String[] strings) throws ParseException {
        for (int i = 1; i < strings.length; i += 3) {
            String nameFirst = strings[i];
            String stringSex = strings[i + 1];
            Date date = simpleDateFormatCreate.parse(strings[i + 2]);

            if (stringSex.equals("м")) {
                allPeople.add(Person2.createMale(nameFirst, date));
            } else {
                allPeople.add(Person2.createFemale(nameFirst, date));
            }

            System.out.println(allPeople.size() - 1);
        }

    }

    public static void update(String[] strings) throws ParseException {
        for (int i = 1; i < strings.length; i += 4) {
            int index = Integer.parseInt(strings[i]);
            Sex1 sex = strings[i + 2].equals("м") ? Sex1.MALE : Sex1.FEMALE;
            String name = strings[i + 1];
            Date date = simpleDateFormatCreate.parse(strings[i + 3]);

            allPeople.get(index).setSex(sex);
            allPeople.get(index).setName(name);
            allPeople.get(index).setBirthDate(date);
        }
    }


    public static void delete(int i) {
        allPeople.get(i).setName(null);
        allPeople.get(i).setSex(null);
        allPeople.get(i).setBirthDate(null);
    }


    // "м" "ж"
    public static void info(int i) {
        String s = (allPeople.get(i).getSex().equals(Sex1.MALE)) ? "м" : "ж";

        System.out.println(allPeople.get(i).getName() + " " + s + " "
                + simpleDateFormatInfo.format(allPeople.get(i).getBirthDate()));
    }
}

class Person2 {
    private String name;
    private Sex1 sex;
    private Date birthDate;

    private Person2(String name, Sex1 sex, Date birthDate) {
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
    }

    public static Person2 createMale(String name, Date birthDate) {
        return new Person2(name, Sex1.MALE, birthDate);
    }

    public static Person2 createFemale(String name, Date birthDate) {
        return new Person2(name, Sex1.FEMALE, birthDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex1 getSex() {
        return sex;
    }

    public void setSex(Sex1 sex) {
        this.sex = sex;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
