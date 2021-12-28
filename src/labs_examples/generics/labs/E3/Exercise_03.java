package labs_examples.generics.labs.E3;

import labs_examples.generics.labs.E1.GenericTest;

import java.util.ArrayList;

public class Exercise_03 {
    public static void main(String[] args) {
        GenericMethods gm1 = new GenericMethods();

        //part 1
        System.out.println(gm1.sum(12.35, 14.78));
        System.out.println(gm1.sum(7,5));

        //part 2
        ArrayList<String> list = new ArrayList<>();
        list.add("asdf");
        list.add("abba");
        list.add("asdkfjalsdkf");
        list.add("deffed");
        list.add("ewqtwqr");
        gm1.countPalin(list);

        //part 3
        String[] intArray = {"first", "second", "third", "fourth"};
        gm1.exchangeElem(intArray, 3,0);

        //part 4
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(17);
        list2.add(4);
        list2.add(10);
        list2.add(20);
        gm1.largestElem(list2, 0,3);


    }
}
