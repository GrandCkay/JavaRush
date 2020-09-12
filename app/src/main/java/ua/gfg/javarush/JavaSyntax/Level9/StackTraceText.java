package ua.gfg.javarush.JavaSyntax.Level9;

public class StackTraceText {
//    public static void main(String[] args) {
//        method1();
//        System.out.println(method1());
//    }
//
//    public static int method1() {
//        method2();
//        //напишите тут ваш код
//        return Thread.currentThread().getStackTrace()[2].getLineNumber();
//    }
//
//    public static int method2() {
//        //напишите тут ваш код
//        return Thread.currentThread().getStackTrace()[2].getLineNumber();
//    }

//    public static void main(String[] args) {
//        int deep = getStackTraceDepth();
//    }
//    public static int getStackTraceDepth() {
//        //напишите тут ваш код
//        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
//        System.out.println(elements.length);
//        return elements.length;
//    }

//    public static void main(String[] args) {
//        log("In main method");
//    }
//    public static void log(String s) {
//        //напишите тут ваш код
//        String nameClass = Thread.currentThread().getStackTrace()[2].getClassName();
//        String nameMethod = Thread.currentThread().getStackTrace()[2].getMethodName();
//        System.out.println(nameClass + ": " + nameMethod + ": " + s);
//    }

    public static void main(String[] args) {
        method1();
        System.out.println(method5());

    }

    public static String method1() {
        method5();
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        //напишите тут ваш код
        return Thread.currentThread().getStackTrace()[3].getMethodName();
    }
}
