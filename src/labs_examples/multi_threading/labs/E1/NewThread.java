package labs_examples.multi_threading.labs.E1;

public class NewThread implements Runnable {
    public NewThread(int priority) {
        Thread t = new Thread(this);
        t.setPriority(priority);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(i);
            }
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }
    }
}
