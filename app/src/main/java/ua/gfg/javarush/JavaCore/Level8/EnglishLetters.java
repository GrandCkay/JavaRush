package ua.gfg.javarush.JavaCore.Level8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnglishLetters {

//    // 2
//    private final static Character[] ENGLISH_CHARACTERS_ARRAY = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L'
//            , 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'
//            , 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//    private final static Set<Character> ENGLISH_CHARACTERS = new HashSet<>(Arrays.asList(ENGLISH_CHARACTERS_ARRAY));


    public static void main(String[] args) throws FileNotFoundException, IOException {
        args = new String[]{"C:\\Users\\Home\\Desktop\\1.txt"};
        int count = 0;

        // 3
        String s = "";
        try (FileInputStream in = new FileInputStream(args[0])) {
            while (in.available() > 0) {
//                // 3.1
//                char ch = (char) in.read();
//                if (Character.toString(ch).matches("^[a-zA-Z]")) {
//                    count++;
//                }

                s += (char) in.read();
            }

            Pattern pattern = Pattern.compile("[a-zA-Z]");
            Matcher matcher = pattern.matcher(s);

            while (matcher.find()) {
                count++;
            }
        }


//        // 2
//        try (FileReader fileReader = new FileReader(args[0])) {
//            while (fileReader.ready()) {
//                char readChar = (char) fileReader.read();
//                if (ENGLISH_CHARACTERS.contains(readChar)) count++;
//            }
//        }

//        // 1
//        try (FileInputStream in = new FileInputStream(args[0])) {
//            while (in.available() > 0) {
//                int i = in.read();
////                // 1.1
////                if ((i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
//                if ((i >= 'A' && i <= 'Z') || (i>= 'a' && i <= 'z')) {
//                    count++;
//                }
//            }
//        }

        System.out.println(count);
    }
}
