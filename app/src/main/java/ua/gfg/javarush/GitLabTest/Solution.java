package ua.gfg.javarush.GitLabTest;

import ua.gfg.javarush.GitLabTest.Bean.DBEvent;
import ua.gfg.javarush.GitLabTest.BusinessValue.Menu;

public class Solution {
    public static void main(String[] args) {
        DBEvent.createDB();
        Menu.menu();
    }
}
