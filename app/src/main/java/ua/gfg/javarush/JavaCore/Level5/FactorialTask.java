package ua.gfg.javarush.JavaCore.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class FactorialTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        if (n < 0) {
            return "0";
        }

        // 2
        BigDecimal bd = new BigDecimal(1);
        for (int i = 1; i <= n; i++) {
            bd = bd.multiply(new BigDecimal(i));
        }

        return bd.toString();

//        // 1
//        BigInteger j = BigInteger.ONE;
//            for (int i = 1; i < n + 1; i++) {
//                j = j.multiply(BigInteger.valueOf(i));
//            }
//            return j.toString();
    }
}
