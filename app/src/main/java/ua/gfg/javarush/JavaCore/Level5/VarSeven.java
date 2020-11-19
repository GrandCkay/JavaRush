package ua.gfg.javarush.JavaCore.Level5;

public class VarSeven {

    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        VarSeven varSeven = new VarSeven();
        System.out.println(varSeven.intVar);
        System.out.println(varSeven.doubleVar);
        System.out.println(varSeven.DoubleVar);
        System.out.println(varSeven.booleanVar);
        System.out.println(varSeven.ObjectVar);
        System.out.println(varSeven.ExceptionVar);
        System.out.println(varSeven.StringVar);

        System.out.println(new VarSeven());
    }

    @Override
    public String toString() {
        return "VarSeven {" +
                "intVar=" + intVar +
                ", doubleVar=" + doubleVar +
                ", DoubleVar=" + DoubleVar +
                ", booleanVar=" + booleanVar +
                ", ObjectVar=" + ObjectVar +
                ", ExceptionVar=" + ExceptionVar +
                ", StringVar='" + StringVar + '\'' +
                '}';
    }
}
