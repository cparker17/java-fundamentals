package labs_examples.multi_threading.labs.E4;

//synchronized method below
//remove comments from SampleThread run() method to run program with synchronized block instead
public class SampleSync {
    public synchronized int add(int a, int b, boolean opt) {
        System.out.println("Add method starting...");
        if(opt) {
            try {
                System.out.println("Thread 1 pausing...");
                Thread.sleep(10000);
                System.out.println("Thread 1 restarting...");
            } catch (InterruptedException exc) {
                exc.printStackTrace();
            }
            return a + b;
        }
        System.out.println("Add method finishing...");
        return a + b;
    }
}
