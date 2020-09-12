package ua.gfg.javarush.JavaSyntax.Level9;

import android.os.RemoteException;

import java.io.IOException;
// import java.rmi.RemoteException;

public class UncheckedTryCatchException {
    public static void main(String[] args) throws NoSuchFieldException, IOException, RemoteException {
        handleExceptions(new CheckedTryCatchException());
    }

    public static void handleExceptions(CheckedTryCatchException obj) throws IOException, NoSuchFieldException, RemoteException {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (RuntimeException e) {
            printStack(e);
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

