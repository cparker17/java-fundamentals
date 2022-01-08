package labs_examples.datastructures.linkedlist.labs;

public class LinkedList_E3 {
    public static void main(String[] args) {
        CustomDoublyLinkedList cdlm = new CustomDoublyLinkedList<>();

        cdlm.add(1);
        cdlm.add(2);
        cdlm.add(3);
        cdlm.add(4);
        cdlm.add(5);
        System.out.println(cdlm.get(0) + " " + cdlm.get(1) + " " + cdlm.get(2) + " " +
                cdlm.get(3) + " " + cdlm.get(4));

        cdlm.removeWithIndex(2);
        System.out.println(cdlm.get(0) + " " + cdlm.get(1) + " " + cdlm.get(2) + " " +
                cdlm.get(3));
    }
}
