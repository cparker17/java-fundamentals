package labs_examples.datastructures.stack.labs;

public class CustomStackTest {
    public static void main(String[] args) {
        CustomStack<Integer> cStack = new CustomStack<>();

        //push 3 values onto the stack
        cStack.push(1);
        cStack.push(2);
        cStack.push(3);

        //print out the stack with the 3 new elements
        cStack.print();

        System.out.println();

        //pop the first element off the stack and print its value
        System.out.println(cStack.pop());

        //print out the size of the stack
        System.out.println(cStack.size());

        //look at the element at the top of the stack and print its value
        System.out.println(cStack.peekFirst());

        //look at the element at the bottom of the stack and print its value
        System.out.println(cStack.peekLast());
    }
}
