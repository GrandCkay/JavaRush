package ua.gfg.javarush.JavaCore.Level8;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Stack;

// C:\Users\Home\Desktop\1.txt
public class ReverseFile {
    public static void main(String[] args) throws Exception {


        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
             FileOutputStream out = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())) {

//            Stack stack = new Stack();
            Stack<Byte> stack = new Stack();

            while (in.available() > 0) {
//                stack.push(in.read());
                stack.push((byte) in.read());
            }

            while (!stack.empty()) {
//                out.write((int) stack.pop());
                out.write(stack.pop());
            }
        }

//        // 2
//        List<Integer> list = new ArrayList<>();
//        try (FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//             FileOutputStream out = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine())){
//
//            while (in.available() > 0) {
//                list.add(in.read());
//            }
//
//            Collections.reverse(list);
//            for (Integer integer : list) {
//                out.write(integer);
//            }
//        }

//        // 1
//        FileInputStream in = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//        FileOutputStream out = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
//
//        byte[] bytes = new byte[in.available()];
//        in.read(bytes);
//
//        for (int i = bytes.length - 1; i >= 0; i--) {
//            out.write(bytes[i]);
//        }
//
//        in.close();
//        out.close();
    }
}



