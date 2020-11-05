package ua.gfg.javarush.JavaCore.Level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;


    /*
        НОД: 4 уровень, 8 лекция Java Core

        Введи с клавиатуры 2 целых положительных числа. Выведи в консоли наибольший общий делитель.
        Если введенные строки невозможно преобразовать в положительные целые числа,
        должно возникать исключение, и успешно завершаться.
    */

public class NOD {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i1 = Integer.parseInt(reader.readLine());
        int i2 = Integer.parseInt(reader.readLine());

        // 4
        int max = 0;

        if (i1 < 1 || i2 < 1) throw new Exception();

        for (int j = 1; j < Math.max(i1, i2); j++) {
            if ((i1 % j == 0) && (i2 % j) == 0) {
                max = j;
            }
        }
        System.out.println(max);
    }


//        // 3
//        if (i1 > 0 && i2 > 0) {
//            System.out.println(nod(i1, i2));
//        } else {
//            throw new IllegalArgumentException();
//        }
//    }
//
//    public static int nod(int i, int j) {
//        return j != 0 ? nod(j, i % j) : i;
//    }

//        // 2
//        System.out.println(getNOD(i1, i2));
//    }
//
//    private static int getNOD(int first, int second) {
//        if (first < 1 || second < 1) {
//            throw new IllegalArgumentException();
//        }
//        while (first != second) {
//            if (first > second) {
//                first -= second;
//            }
//            if (second > first) {
//                second -= first;
//            }
//        }
//        return first;
//    }


//          // 1
//        ArrayList<Integer> arrayList1 = new ArrayList<>();
//        ArrayList<Integer> arrayList2 = new ArrayList<>();
//        int max = 0;
//
//        if (i1 <= 0 || i2 <= 0) {
//            throw new Exception("Enter positive integers");
//        }
//
//        divider(i1, arrayList1);
//        divider(i2, arrayList2);
//
//        for (int i = 0; i < arrayList1.size(); i++) {
//            for (int j = 0; j < arrayList2.size(); j++) {
//                if (arrayList1.get(i) == arrayList2.get(j)) {
//                    max = arrayList1.get(i);
//                }
//            }
//        }
//        System.out.println(max);
//    }
//
//    public static void divider(int j, ArrayList arrayList) {
//        for (int i = 1; i <= j; i++) {
//            if (j % i == 0) {
//                arrayList.add(i);
//            }
//        }
//    }
}
