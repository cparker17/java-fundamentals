package labs_examples.multi_threading.labs.E5;

public class SampleSync2 {
    boolean control = true;

    public synchronized int add(int a, int b) {
        while(!control) {
            try {
                System.out.println(control);
                wait();
                System.out.println("Thread 1 continuing...");
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
        control = false;
        notifyAll();
        return a + b;
    }

    public synchronized int subtract(int a, int b) {
        while(control) {
            try {
                System.out.println("Thread 2 waking up Thread 1 and then waiting.");
                notifyAll();
                wait();
                System.out.println("Thread 2 continuing...");
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
        }
        control = true;
        notifyAll();
        return a - b;
    }
}
