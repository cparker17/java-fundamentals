package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Set;

public class E1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        HashMap<Integer, String> hm2 = new HashMap<>();

        hm.put(1, "Chris");
        hm.put(2, "Alina");
        hm.put(3, "Olivia");
        hm.put(4, "Ethan");
        hm2.put(1, "Bear");
        hm2.put(2, "Duke");
        hm2.put(3, "Poppy");
        hm2.put(4, "Salem");

        hm.putAll(hm2);

        System.out.println(hm.get(3));

        System.out.println(hm.size());

        System.out.println("hm contains Alina: " + hm.containsValue("Alina"));

        Set s = hm.entrySet();
        System.out.println(s.toString());

        hm.putIfAbsent(5, "Boots");
        System.out.println(hm.toString());

        hm.remove(1);
        System.out.println(hm.toString());

        hm.replace(5, "Sawyer");
        System.out.println(hm.toString());

        hm.forEach((key, value) -> {
            value = value.toUpperCase();
            System.out.println(value);
        });

        hm.clear();
        System.out.println(hm.toString());
    }
}
