package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;

public class LinkedList_E2 {
    public static void main(String[] args) {
        CustomLinkedList<Integer> clm = new CustomLinkedList<>();

        clm.add(1);
        clm.add(2);
        clm.add(3);
        clm.add(4);
        clm.add(5);
        System.out.println(clm.get(0) + " " + clm.get(1) + " " + clm.get(2) + " " +
                clm.get(3) + " " + clm.get(4));

        //remove the value 3 from the list
        clm.removeWithValue(2);
        ArrayList<Integer> arrayList = clm.toArrayList();
        for(Integer value : arrayList) {
            System.out.println(value);
        }

        System.out.println(clm.getIndex(4));

        //remove the first element from the list
        clm.removeFromBeginning();
        System.out.println(clm.size());

        //remove the last element from the list
        clm.removeFromEnd();
        System.out.println(clm.size());

        //remove all elements from the list
        clm.clear();
        System.out.println(clm.size());

    }
}
