package ua.gfg.javarush.JavaSyntax.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinIntFromN {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум тут
        return Collections.min(array);
    }


    public static List<Integer> getIntegerList() throws IOException {
        // Создать и заполнить список тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberN = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < numberN; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }
}
