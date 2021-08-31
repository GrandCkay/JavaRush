package ua.gfg.javarush.GitLabTest;

public class Solution {

    public static void main(String[] args) {
        Event soccer = new Event("Футбол Італія-Англія", "10.09.2021", 1500, 35000);
        Event concert = new Event("Концерт групи Бумбокс", "12.05.2021", 350, 1000);
        Event film = new Event("Фільм під відкритим небом", "21.07.2021", 200, 20);
        Event festival = new Event("Джаз-фестиваль в парку", "01.08.2021", 50, 100);

        Event.eventList.add(soccer);
        Event.eventList.add(concert);
        Event.eventList.add(film);
        Event.eventList.add(festival);

        Menu.menu();
    }
}
