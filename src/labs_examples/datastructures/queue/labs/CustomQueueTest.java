package labs_examples.datastructures.queue.labs;

public class CustomQueueTest {
    public static void main(String[] args) {
        CustomQueue<Integer> q = new CustomQueue<>();

        //push 3 values into the queue
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);

        //print out the stack with the 3 new elements
        q.print();

        System.out.println();

        //pop the first element off the queue and print its value
        System.out.println("pop: " + q.pop());

        //print out the size of the queue
        System.out.println(q.size());
        q.print();
        System.out.println();

        //look at the element at the start of the queue and print its value
        System.out.println(q.peekFirst());

        //look at the element at the end of the queue and print its value
        System.out.println(q.peekLast());
    }
}
