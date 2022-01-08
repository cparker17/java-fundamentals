package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

public class QueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        //adds 3 elements to the queue
        q.add(1);
        q.add(2);
        q.add(3);

        //prints out the head of the queue
        System.out.println(q.element());

        //checks if the queue has space to add the element and then adds it if there is space
        System.out.println(q.offer(7));

        //prints out the head of the queue
        System.out.println(q.peek());

        //prints out and removes the head of the queue
        System.out.println(q.poll());

        //remove the head of the queue and then prints out the resulting queue
        q.remove();
        System.out.println(q.toString());
    }
}
