package ua.gfg.javarush.JavaCore.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// http://javarush.ru/alpha/index.html?lvl=15&value&name=Amigo
// http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
// http://javarush.ru/alpha/index.html?obj=3


public class ParserRequest {
    public static void main(String[] args) throws IOException {
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String stringURL = reader.readLine();       // http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo

        int indexURL = stringURL.indexOf("?") + 1;
        String lineValue = stringURL.substring(indexURL);     // obj=3.14&name=Amigo

        String[] value = lineValue.split("&");      //  0) lvl=15    1) value    2) name=Amigo


//        // 3
//        for (String s : value) {
//            System.out.print(s.split("=") [0] + " ");
//        }
//
//        System.out.println();
//
//        for (String s : value) {
//            try {
//                if (s.split("=")[0].equals("obj")) {
//                    alert(Double.parseDouble(s.split("=")[1]));
//                }
//            } catch (Exception e) {
//                alert(s.split("=")[1]);
//            }
//        }


        // 2
//        String lineValue = stringURL.substring(stringURL.lastIndexOf("?") + 1);   // obj=3.14&name=Amigo
//
//        String objValue = null;
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String s : value) {
//            String[] paramAndValue = s.split("=");
//            stringBuilder.append(paramAndValue[0]);
//            stringBuilder.append(" ");
//
//            if (paramAndValue[0].equals("obj")) {
//                objValue = paramAndValue[1];
//            }
//        }
//
//        System.out.println(stringBuilder.toString().trim());
//
//        if (objValue != null) {
//            try {
//                alert(Double.parseDouble(objValue));
//            } catch (NumberFormatException e) {
//                alert(objValue);
//            }
//        }


        // 1
        String[] stringIndexNumber = new String[value.length];

        for (int i = 0, j = 0; i < value.length; i++) {
            if (value[i].contains("=")) {
                int indexValue = value[i].indexOf("=");
                if (indexValue > 0) {
                    stringIndexNumber[j] = value[i].substring(indexValue + 1);
                    j++;
                }
                value[i] = value[i].substring(0, indexValue);
            }
        }

        for (String s : value) {
            System.out.print(s + " ");
        }

        for (String s : value) {
            if (s.equals("obj")) {
                System.out.println();
                try {
                    alert(Double.parseDouble(stringIndexNumber[0]));
                } catch (Exception e) {
                    alert(stringIndexNumber[0]);
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
