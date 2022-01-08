package labs_examples.datastructures.stack.labs;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();

        //add some preliminary values to the intStack
        intStack.add(1);
        intStack.add(2);
        intStack.add(3);
        intStack.add(4);

        //pushes the integer 5 onto the top of the stack
        intStack.push(5);
        System.out.println(intStack.toString());

        //removes the element on the top of the stack (5)
        intStack.pop();
        System.out.println(intStack.toString());

        //tests if the intStack is empty
        System.out.println(intStack.empty());

        //looks at the element at the top of the stack without removing it
        System.out.println(intStack.peek());

        //search for the element equal to 3 and return the index of that element
        System.out.println(intStack.search(3));
    }
}
