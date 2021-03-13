package ua.gfg.javarush.JavaCore.Level9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;


// C:\Users\Home\Desktop\2.txt

public class AndOneMoreAdapter {
    public static void main(String[] args) throws IOException, ParseException {

        Scanner scanner = new Scanner(new File("C:\\Users\\Home\\Desktop\\2.txt"));

        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(scanner);

        System.out.println(personScannerAdapter.read());

        personScannerAdapter.close();
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {

//            // 1.1 !!!
//            String[] fullStrings = fileScanner.nextLine().split(" ");
//            String stringDate = fullStrings[3] + " " + fullStrings[4] + " " + fullStrings[5];
//            Date birthDate =  new SimpleDateFormat("dd MM yyyy", Locale.getDefault()).parse(stringDate);

            // 1
            String[] fullStrings = fileScanner.nextLine().split(" ", 4);
            Date birthDate =  new SimpleDateFormat("dd MM yyyy", Locale.getDefault()).parse(fullStrings[3]);

//            // 2
//            String[] fullStrings = fileScanner.nextLine().split(" ");

//            Calendar calendar = new GregorianCalendar(Integer.parseInt(fullStrings[5]), Integer.parseInt(fullStrings[4]) - 1, Integer.parseInt(fullStrings[3]));
//            Date birthDate = calendar.getTime();


            String firstName = fullStrings[1];
            String middleName = fullStrings[2];
            String lastName = fullStrings[0];

            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}

class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private Date birthDate;

    public Person(String firstName, String middleName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", lastName, firstName, middleName, birthDate.toString());
    }
}

interface PersonScanner {
    Person read() throws IOException, ParseException;

    void close() throws IOException;
}
