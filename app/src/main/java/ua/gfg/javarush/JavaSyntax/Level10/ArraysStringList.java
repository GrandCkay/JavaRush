package ua.gfg.javarush.JavaSyntax.Level10;

import java.util.ArrayList;

public class ArraysStringList {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] array = new ArrayList[2];

//        // 1
//        ArrayList<String> arrayList1 = new ArrayList<>();
//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList1.add("1.1");
//        arrayList1.add("1.2");
//        arrayList2.add("2.1");
//        arrayList2.add("2.2");
//        array[0] = arrayList1;
//        array[1] = arrayList2;

        // 2
        array[0] = new ArrayList<>();
        array[1] = new ArrayList<>();

        array[0].add("1.1");
        array[1].add("2.1");
        array[0].add("1.2");

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
