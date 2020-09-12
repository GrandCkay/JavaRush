package ua.gfg.javarush.JavaSyntax.Level9;

import android.os.RemoteException;

import java.io.IOException;

public class CheckedTryCatchException {
    public static void main(String[] args) {
        handleExceptions(new CheckedTryCatchException());

    }

    public static void handleExceptions(CheckedTryCatchException obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
