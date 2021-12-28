package labs_examples.multi_threading.labs.E6;

public class EvensThread implements Runnable {
    PrintNumbers pn;

    public EvensThread(PrintNumbers pn) {
        this.pn = pn;
    }
    public void run() {
        pn.printEvens();
    }
}
