package ua.gfg.javarush.JavaSyntax.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LongestSequence {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        List<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 1;
        int add = 1;

        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(arrayList.get(i - 1))) {
                add++;
                count = setCount(add, count);
            } else {
                count = setCount(add, count);
                add = 1;
            }
        }
        System.out.println(count);
    }

    protected static int setCount(int add, int count) {
        if (add > count) {
            count = add;
        }
        return count;
    }
}