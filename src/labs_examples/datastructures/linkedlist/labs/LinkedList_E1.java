package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_E1 {
    public static void main(String[] args) {
        LinkedList<Integer> intList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(9);
        arrayList.add(2);

        //adds 7 to the end of the list
        intList.add(7);
        //adds all of the elements in the array list to the end of the list
        intList.addAll(arrayList);
        //adds 15 to the beginning of the list
        intList.addFirst(15);
        //adds 13 to the end of the list
        intList.addLast(13);
        System.out.println(intList.toString());

        //gets the first element in the list
        System.out.println(intList.getFirst());
        //gets the last element in the list
        System.out.println(intList.getLast());
        //gets the 3rd element in the list
        System.out.println(intList.get(2));
        //changes the 3rd element in the list to 18;
        intList.set(2, 18);
        System.out.println(intList.toString());

        //pushes an element to the start of the list stack
        intList.push(20);
        System.out.println(intList.toString());
        //pops the top element from the list off the stack
        System.out.println(intList.pop());

        //removes the element equal to 7 from the list
        intList.remove((Integer) 7);
        System.out.println(intList.toString());

        //returns true if the list contains the value 2
        System.out.println(intList.contains((2)));

        //sets up an interator for traversing the list starting at index 2 and then gets the next value
        int x = intList.listIterator(2).next();
        System.out.println(x);

        //removes all the values from the list
        intList.clear();
        System.out.println(intList.toString());
    }
}
