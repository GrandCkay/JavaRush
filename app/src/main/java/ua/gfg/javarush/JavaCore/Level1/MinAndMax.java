package ua.gfg.javarush.JavaCore.Level1;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Arrays;

public class MinAndMax {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

//        int x = Integer.MAX_VALUE;
//        int y = Integer.MIN_VALUE;
//        for (int i = 0; i < inputArray.length; i++) {
//            if (inputArray[i] < x) {
//                x = inputArray[i];
//            }
//            if (inputArray[i] > y) {
//                y = inputArray[i];
//            }
//        }

//        int[] ints = Arrays.copyOf(inputArray, inputArray.length);
//        Arrays.sort(ints);
//        return new Pair<>(ints[0], ints[ints.length - 1]);


        return new Pair<>(Arrays.stream(inputArray).min().getAsInt(), Arrays.stream(inputArray).max().getAsInt());

//        List<Integer> list = new ArrayList<>();
//        for (int i : inputArray) {
//            list.add(i);
//        }
//        return new Pair<>(Collections.min(list), Collections.max(list));

//        Pair pair = new Pair(x, y);
//        // напишите тут ваш код
//        return pair;
//        return new Pair<Integer, Integer>(x, y);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }

}
