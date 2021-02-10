package ua.gfg.javarush.JavaCore.Level8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// C:\Users\Home\Desktop\1.txt

public class CrUDTable {

//        // 3
//    public static void main(String[] args) throws Exception {
//        args = new String[]{"-c", "Black Jacket", "350.00", "5"};
//
//        String fileName;
//        int id, newId = 0;
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            fileName = reader.readLine();
//        }
//
//        if (args.length == 0) {
//            return;
//        }
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
//            while (bufferedReader.ready()) {
//                id = Integer.parseInt(bufferedReader.readLine().substring(0, 8).trim());
//                if (id > newId) {
//                    newId = id;
//                }
//            }
//        }
//
//        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
//            fileWriter.write(String.format(System.lineSeparator() + "%-8d%-30.30s%-8.8s%-4.4s", ++newId, args[1], args[2], args[3]));
//        }
//    }


    // 2
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format(System.lineSeparator() + "%-8d%-30.30s%-8.8s%-4.4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws Exception {
        args = new String[]{"-c", "Black Hat", "22.50", "19"};

        if (args.length == 0) {
            return;
        }

        List<Product> productList = new ArrayList<>();
        String fileName;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                productList.add(product);
            }
        }

        switch (args[0]) {
            case "-c":
                String name = args[1], price = args[2], quantity = args[3];

                int id = 0;
                for (Product product : productList) {
                    if (product.id > id) {
                        id = product.id;
                    }
                }

                Product product = new Product(++id, name, price, quantity);
                productList.add(product);

                try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                    fileWriter.write(product.toString());
                }
                break;
        }
    }

    public static Product getProduct(String string) {
        int countId = 8, countName = 38, countPrice = 46, countQuantity = 50;

        String id = string.substring(0, countId).trim();
        String name = string.substring(countId, countName).trim();
        String price = string.substring(countName, countPrice).trim();
        String quantity = string.substring(countPrice, countQuantity).trim();

        return new Product(Integer.parseInt(id), name, price, quantity);
    }


//    // 1
//    public static void main(String[] args) throws Exception {
//        args = new String[]{"-c", "ProductName", "Price", "Quantity"};
//
//        int newId, countId = 8, countName = 30, countPrice = 8, countQuantity = 4;
//        List<Integer> integerArrayList = new ArrayList<>();
//        String fileName;
//
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//            fileName = reader.readLine();
//        }
//
//        if (args.length == 0) {
//            return;
//        }
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
//            for (String s; (s = bufferedReader.readLine()) != null; ) {
//                int index = s.indexOf(' ');
//
//                if (index > -1 && index < countId) {
//                    integerArrayList.add(Integer.parseInt(s.substring(0, index)));
//                } else {
//                    integerArrayList.add(Integer.parseInt(stringToCharArray(countId, s).toString()));
//                }
//            }
//        }
//
//        newId = Collections.max(integerArrayList) + 1;
//
//        StringBuilder stringNewId = paddingSpaces(countId, String.valueOf(newId));
//        StringBuilder stringNewName = paddingSpaces(countName, args[1]);
//        StringBuilder stringNewPrice = paddingSpaces(countPrice, args[2]);
//        StringBuilder stringNewQuantity = paddingSpaces(countQuantity, args[3]);
//
//        String stringNewProduct = "\n" + stringNewId + stringNewName + stringNewPrice + stringNewQuantity;
//
//        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
//            fileWriter.write(stringNewProduct);
//        }
//    }
//
//    public static StringBuilder paddingSpaces(int count, String original) {
//        StringBuilder string = new StringBuilder(original);
//
//        if (string.length() <= count) {
//            for (int j = string.length(); j < count; j++) {
//                string.append(" ");
//            }
//        } else {
//            string = stringToCharArray(count, original);
//        }
//        return string;
//    }
//
//    public static StringBuilder stringToCharArray(int count, String original) {
//        StringBuilder string = new StringBuilder();
//        char[] chars = original.toCharArray();
//
//        for (int j = 0; j < count; j++) {
//            string.append(chars[j]);
//        }
//        return string;
//    }
}




















