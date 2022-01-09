package labs_examples.datastructures.hashmap.labs;

public class CustomHashMap2Test {
    public static void main(String[] args) {
        CustomHashMap2<Integer, Integer> hm = new CustomHashMap2<>();

        hm.put2(1,1);
        hm.put2(2,2);
        hm.put2(3,3);
        hm.put2(1,2);

        System.out.println(hm.containsKey(3));
        System.out.println(hm.get2(1));

        System.out.println(hm.getStorage());
        System.out.println(hm.get2(1));

        hm.clear();
        System.out.println(hm.getStorage());
        System.out.println(hm.get2(3));




    }
}
