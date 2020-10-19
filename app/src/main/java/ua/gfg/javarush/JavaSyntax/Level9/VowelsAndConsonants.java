package ua.gfg.javarush.JavaSyntax.Level9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// истина в вине

public class VowelsAndConsonants {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // 3
        String text = reader.readLine();

        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();

        for (char ch : text.toCharArray()) {
            if (isVowel(ch)) {
                stringBuffer.append(ch).append(" ");
            } else if (ch != ' ') {
                stringBuffer1.append(ch).append(" ");
            }
        }

        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);

        // 2
//        String text = reader.readLine().replaceAll("\\s+", ""), stVowels = "", stConsonant = "";

//        for (int i = 0; i < text.length(); i++) {
//            if (isVowel(text.charAt(i))) {
//                stV += text.charAt(i) + " ";
//            } else {
//                stC += text.charAt(i) + " ";
//            }
//        }

//        for (char c : text.toCharArray()) {
//            if (isVowel(c)) {
//                stV += c + " ";
//            } else {
//                stC += c + " ";
//            }
//        }
//        System.out.println(stV);
//        System.out.println(stC);

        // 1
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String text = reader.readLine();

//        ArrayList<Character> charactersVowels = new ArrayList<>();
//        ArrayList<Character> charactersConsonant = new ArrayList<>();
//        char[] chars = text.toCharArray();
//
//        for (int i = 0; i < text.length(); i++) {
//            if (isVowel(chars[i])) {
//                charactersVowels.add(chars[i]);
//            } else if (!isVowel(chars[i]) && chars[i] != ' ') {
//                charactersConsonant.add(chars[i]);
//            }
//        }
//
//        for (Character charactersVowel : charactersVowels) {
//            System.out.print(charactersVowel + " ");
//        }
//
//        System.out.println();
//
//        for (Character character : charactersConsonant) {
//            System.out.print(character + " ");
//        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char d : vowels) {  // ищем среди массива гласных
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}
