package ua.gfg.javarush.JavaCore.Level9;

import java.util.HashMap;
import java.util.Map;

public class FixingTheAdapter {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("CA", "Canada");
        countries.put( "RU", "Russia");
        countries.put( "UA", "Ukraine");
    }

    public static void main(String[] args) {
        Customer customer = new Customer() {
            @Override
            public String getCompanyName() {
                return "JavaRush Ltd.";
            }

            @Override
            public String getCountryName() {
                return "Ukraine";
            }
        };

        Contact contact = new Contact() {
            @Override
            public String getName() {
                return "Ivanov, Ivan";
            }

            @Override
            public String getPhoneNumber() {
                return " +38(050)123-45-67 ";          //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
            }
        };

        DataAdapter dataAdapter = new DataAdapter(customer, contact);

        System.out.println(dataAdapter.getCountryCode());
        System.out.println(dataAdapter.getCompany());
        System.out.println(dataAdapter.getContactFirstName());
        System.out.println(dataAdapter.getContactLastName());
        System.out.println(dataAdapter.getDialString());
    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String s = "";
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getValue().equals(customer.getCountryName())) {
                    s = entry.getKey();
                }
            }
            return s;
        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String s = contact.getName();

//            // 1
//            return s.substring(s.indexOf(" ") + 1);

            // 2
            return s.split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            String s = contact.getName();

//            // 1
//            return s.substring(0, s.indexOf(","));

            // 2
            return s.split(", ")[0];
        }

        @Override
        public String getDialString() {

            // 1
            String s = contact.getPhoneNumber().replaceAll("\\s*(\\D)\\s*", "");      //    [\\D]  ;  [()-]
            return "callto://+" + s;

////            // 2
//            return "callto://" + contact.getPhoneNumber().replaceAll("[^\\d, +]", "");
        }
    }

    public static interface RowItem {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        String getDialString();         //For example: callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67 or +3(805)0123-4567 or +380(50)123-4567 or ...
    }
}












