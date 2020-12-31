package ua.gfg.javarush.NY2021;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


// C:\Users\Home\Desktop\NY2021.txt
public class HappyNewYear2021 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    // C:\Users\Home\Desktop\NY2021.txt
    public static void main(String[] args) throws IOException, InterruptedException {
        List<String> listColor = Arrays.asList(RED, GREEN, YELLOW, BLUE, PURPLE, CYAN);

        HashMap<String, String> hashMap = new LinkedHashMap<>();

        BufferedReader readerFile = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(readerFile.readLine().trim()));

        // C:\Users\Home\Desktop\NY2021.txt
        Collections.shuffle(listColor, new Random());

        int i = 0;
        for (String s; (s = reader.readLine()) != null; ) {
            hashMap.put(s, listColor.get(i));
            i++;
            if (i == listColor.size()) {
                i = 0;
                Collections.shuffle(listColor, new Random());
            }
        }

        System.out.println();

        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            Thread.sleep(1500);
            System.out.println("\t" + entry.getValue() + entry.getKey());
        }

        System.out.println();
        fir(listColor, 20);

        System.out.println(RESET);
        readerFile.close();
        reader.close();
    }

    // C:\Users\Home\Desktop\NY2021.txt
    private static void fir(List list, int count) throws InterruptedException {
        int max = count;
        String spaceTree = "", stringHash = "#####";

        for (int i = 0, k = 0; i < max; i++, k++) {
            String space = "", star = "";

            for (int j = 0; j < max - i; j++) {
                space += " ";

                if (j == (count - (stringHash.length() - 1))) {
                    spaceTree = space;
                }
            }

            for (int l = 0; l < 2 * i + 1; l++) {
                star += "*";
            }

            if (k == list.size()) {
                k = 0;
                Collections.shuffle(list, new Random());
            }

            System.out.println("\t" + list.get(k) + space + star);
            Thread.sleep(500);
        }

        Thread.sleep(500);
        System.out.println("\t" + RESET + spaceTree + stringHash);
    }
}

// C:\Users\Home\Desktop\NY2021.txt













