package ua.gfg.javarush.JavaCore.Level5;

public class OOPHryvnia {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return getMoney().getAmount();
        }
    }

    //add your code below - добавь код ниже
    public static class Hryvnia extends Money {
        private double amount = 123d;

        public Hryvnia getMoney() {
            return this;
        }


        public Object getAmount() {
            return amount;
        }

        
        //        @Override
//        public Double getAmount() {
//            return this.amount;
//        }
    }
}

