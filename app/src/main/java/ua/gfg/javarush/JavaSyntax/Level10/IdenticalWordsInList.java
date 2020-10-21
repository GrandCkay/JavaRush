package ua.gfg.javarush.JavaSyntax.Level10;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


//        Машина    1
//        Перерыв   1
//        Скакун    1
//        Телефон   1
//        Игра      2
//        пророк    3
//        Яблоко    4
//        платок    1
//        дерево    1
//        уксус     2
//        шишка     1
//        шайба     1
//        пикник    1
//        уксус
//        Игра
//        пророк
//        Яблоко
//        пророк
//        Яблоко
//        Яблоко


public class IdenticalWordsInList {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();
        // напишите тут ваш код

        // 1
        for (int j = 0; j < list.size(); j++) {
            int count = 0;
            for (int i = 0; i < list.size(); i++) {

                if (list.get(j).equals(list.get(i))) {
                    count++;
                }
            }
            if (count == 0) {
                count = 1;
                result.put(list.get(j), count);
            } else {
                result.put(list.get(j), count);
            }
        }

//        // 2
//        for (String s : list) {
//            Integer count = result.get(s);
//            result.put(s, (count == null) ? 1 : count + 1);
//        }


//        // 3
//            for (int j = 0; j < list.size(); j++) {
//            int count = Collections.frequency(list, list.get(j));
//            result.put(list.get(j), count);
//        }

//        // 4
//        for (String s : list) {
//            int count = result.getOrDefault(s, 0);
//            result.put(s, count + 1);
//        }


        return result;
    }
}
