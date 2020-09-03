package ua.gfg.javarush.JavaSyntax.Level8;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Solution {
    public static void main(String[] args) throws Exception {
//        Set<String> set = new HashSet<>();
//        set.add("арбуз");
//        set.add("банан");
//        set.add("вишня");
//        set.add("груша");
//        set.add("дыня");
//        set.add("ежевика");
//        set.add("женьшень");
//        set.add("земляника");
//        set.add("ирис");
//        set.add("картофель");

//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            String string = iterator.next();
//            System.out.println(string);
//        }
//        for (String s : set) {
//            System.out.println(s);
//        }


//        List<String> list = new ArrayList<>();
//        list.add();
//
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String next =  iterator.next();
//            System.out.println(next);
//        }
//
//        Map<String, String> map = new HashMap<>();
//        map.put("арбуз", "ягода,");
//        map.put("банан", "трава,");
//        map.put("вишня", "ягода,");
//        map.put("груша", "фрукт,");
//        map.put("дыня", "овощ,");
//        map.put("ежевика", "куст,");
//        map.put("жень-шень", "корень,");
//        map.put("земляника", "ягода,");
//        map.put("ирис", "цветок,");
//        map.put("картофель", "клубень,");


//        Iterator<Map.Entry<String, String>> iteratorMap = map.entrySet().iterator();
//        while (iteratorMap.hasNext()) {
//            Map.Entry<String, String> pair =  iteratorMap.next();
//            String key = pair.getKey();
//            String value = pair.getValue();
//            System.out.println(key + " - " + value);
//        }
//
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            String key = pair.getKey();
//            String value = pair.getValue();
//            System.out.println(key + " - " + value);
//        }

        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        Map<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> stringCatMap = new HashMap<>();
        for (int i = 0; i < cats.length; i++) {
            stringCatMap.put(cats[i], new Cat(cats[i]));
        }
        return stringCatMap;
    }

    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}
