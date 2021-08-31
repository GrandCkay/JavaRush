package ua.gfg.javarush.GitLabTest.BusinessValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

    public static void menu() {
        String menuString = "\nДля створення нового івенту натисніть - 1." +
                "\nДля купівлі квитків натисніть - 2." +
                "\nДля перегляду доступних івентів натисніть - 3." +
                "\nДля перегляду придбаних квитків натисніть - 4." +
                "\nДля завершення натисніть - 0";

        System.out.println(menuString);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line;

            while (!(line = reader.readLine()).equals("0")) {
                switch (line) {
                    case "1":
                        CreateNewEvent.createNewEvent();
                        break;
                    case "2":
                        BuyTicket.buyTicket();
                        break;
                    case "3":
                        PrintEventList.printEventList();
                        break;
                    case "4":
                        ShowTicket.showTicket();
                        break;
                    default:
                        System.out.println("Невірний вибір.");
                }
                System.out.println(menuString);
            }
            System.out.println("Дякую, допобачення.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
