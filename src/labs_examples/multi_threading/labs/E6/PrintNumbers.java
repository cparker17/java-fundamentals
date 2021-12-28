package labs_examples.multi_threading.labs.E6;

public class PrintNumbers {
    public synchronized void printEvens() {
            for (int i = 2; i <= 100; i += 2) {
                System.out.print(i + " ");
                try {
                    notifyAll();
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }

    public synchronized void printOdds() {

            for(int i = 1; i <= 99; i+=2) {
                System.out.print(i + " ");
                try {
                    wait();
                    notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
