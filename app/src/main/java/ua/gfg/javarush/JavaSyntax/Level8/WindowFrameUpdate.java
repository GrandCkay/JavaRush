package ua.gfg.javarush.JavaSyntax.Level8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//              должна   заменять   в тексте   первые  буквы   всех   слов   на   заглавные

public class WindowFrameUpdate {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine().trim();

        //напишите тут ваш код

//        while (string.contains(" ")) {
//            int index = string.indexOf(" ");
//            String s = string.substring(0, index);         // It's not work
//            String s1 = string.substring(index + 1);
//            string = s + s1;
//        }


//        List<String> arrayList = new ArrayList<>(Arrays.asList(string.split("\\s+")));
//        for (int i = 0; i < arrayList.size(); i++) {
//                String s1 = arrayList.get(i).substring(0, 1).toUpperCase();
//                String s2 = arrayList.get(i).substring(1);
//                arrayList.set(i, s1 + s2);
//        }
//
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (i == arrayList.size() - 1) {
//                System.out.print(arrayList.get(i) + "\n");
//            } else {
//                System.out.print(arrayList.get(i) + " ");
//            }
//        }

        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || chars[i - 1] == ' ') {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }
        System.out.println(new String(chars));
    }
}
