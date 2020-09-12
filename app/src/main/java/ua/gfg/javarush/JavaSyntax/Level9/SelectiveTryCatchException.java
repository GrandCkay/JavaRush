package ua.gfg.javarush.JavaSyntax.Level9;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class SelectiveTryCatchException {
    public static StatelessBean BEAN = new StatelessBean();

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void main(String[] args) {
        try {
            handleExceptions();
        } catch (FileSystemException e) {
            BEAN.log(e);
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static void handleExceptions() throws FileSystemException {
        try {
            BEAN.methodThrowExceptions();
        } catch (FileSystemException eFile) {
            BEAN.log(eFile);
            throw eFile;
        } catch (CharConversionException eChar) {
            BEAN.log(eChar);
        } catch (IOException eIO) {
            BEAN.log(eIO);
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
