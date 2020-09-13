package ua.gfg.javarush.JavaSyntax.Level9;

import java.util.ArrayList;

public class ArrayListAdd {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<>();
        arrayList.add(new int[5]);
        arrayList.add(new int[2]);
        arrayList.add(new int[4]);
        arrayList.add(new int[7]);
        arrayList.add(new int[0]);
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
