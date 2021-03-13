package ua.gfg.javarush.JavaCore.Level9;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AdaptingMultipleInterfaces {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("CA", "Canada");
        countries.put( "RU", "Russia");
        countries.put( "UA", "Ukraine");
    }

    public static void main(String[] args) {
        IncomeData incomeData = new IncomeData() {
            @Override
            public String getCountryCode() {
                return "UA";
            }

            @Override
            public String getCompany() {
                return "JavaRush Ltd.";
            }

            @Override
            public String getContactFirstName() {
                return "Ivan";
            }

            @Override
            public String getContactLastName() {
                return "Ivanov";
            }

            @Override
            public int getCountryPhoneCode() {
                return 38;
            }

            @Override
            public int getPhoneNumber() {
                return 501234567;
            }
        };

        IncomeDataAdapter incomeDataAdapter = new IncomeDataAdapter(incomeData);

        System.out.println(incomeDataAdapter.getCompanyName());
        System.out.println(incomeDataAdapter.getCountryName());
        System.out.println(incomeDataAdapter.getName());
        System.out.println(incomeDataAdapter.getPhoneNumber());

    }

    public static class IncomeDataAdapter implements Contact, Customer {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            String country = data.getCountryCode();
            return countries.get(country);
        }

        @Override
        public String getName() {
            return String.format("%s, %s", data.getContactLastName(), data.getContactFirstName());
        }

        @Override                               //For example: 501234567
        public String getPhoneNumber() {        //For example: +38(050)123-45-67
            String number = String.format("%010d", data.getPhoneNumber());
//            number = String.format("%.10s", number);

            String numCode = number.substring(0, 3);
            String num1 = number.substring(3, 6);
            String num2 = number.substring(6, 8);
            String num3 = number.substring(8);

            return String.format("+%s(%s)%s-%s-%s", data.getCountryPhoneCode(), numCode, num1, num2, num3);

//            String res = String.format("+%d(%2$s)%3$s-%4$s-%5$s", data.getCountryPhoneCode(),
//                    String.format("%010d", data.getPhoneNumber()).substring(0, 3),
//                    String.format("%010d", data.getPhoneNumber()).substring(3, 6),
//                    String.format("%010d", data.getPhoneNumber()).substring(6, 8),
//                    String.format("%010d", data.getPhoneNumber()).substring(8));
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }


    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }


    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}





















