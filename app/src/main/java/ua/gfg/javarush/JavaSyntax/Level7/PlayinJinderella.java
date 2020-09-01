package ua.gfg.javarush.JavaSyntax.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PlayinJinderella {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
            if (arrayList.get(i) % 3 == 0) {
                list3.add(arrayList.get(i));
            }
            if (arrayList.get(i) % 2 == 0) {
                list2.add(arrayList.get(i));
            }
            if (arrayList.get(i) % 2 != 0 && arrayList.get(i) % 3 != 0) {
                list.add(arrayList.get(i));
            }
        }
        printList(list3);
        printList(list2);
        printList(list);
    }

    public static void printList(ArrayList<Integer> list) {
        //напишите тут ваш код
        for (int i : list) {
            System.out.println(i);
        }
    }
}
