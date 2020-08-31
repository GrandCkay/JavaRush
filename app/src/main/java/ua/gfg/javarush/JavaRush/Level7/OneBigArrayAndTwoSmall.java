package ua.gfg.javarush.JavaRush.Level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OneBigArrayAndTwoSmall {
    public static void main(String[] args) throws Exception {
        int[] bigArray = new int[20];
        int[] oneSmallArray = new int[10];
        int[] secondSmallArray = new int[(bigArray.length) / 2];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0, j = 10; i < secondSmallArray.length; i++, j++) {
            oneSmallArray[i] = bigArray[i];
            secondSmallArray[i] = bigArray[j];
        }

//        for (int i = 0; i < secondSmallArray.length; i++) {
////            oneSmallArray[i] = bigArray[i];
////            secondSmallArray[i] = bigArray[i + 10];
////        }

//        System.arraycopy(bigArray,0,oneSmallArray,0,10);
//        System.arraycopy(bigArray,10,secondSmallArray,0,10);

//        oneSmallArray =  Arrays.copyOfRange(bigArray, 0, 10);
//        secondSmallArray = Arrays.copyOfRange(bigArray, 10, 20);

//        for (int i : oneSmallArray) {
//            System.out.println(i);
//        }
//        System.out.println("***");

        for (int i : secondSmallArray) {
            System.out.println(i);
        }
    }
}
