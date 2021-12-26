package labs_examples.multi_threading.labs.E2;

public class NewThread2 extends Thread {
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
