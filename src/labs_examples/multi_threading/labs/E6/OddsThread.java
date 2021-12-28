package labs_examples.multi_threading.labs.E6;

public class OddsThread implements Runnable {
    PrintNumbers pn;

    public OddsThread(PrintNumbers pn) {
        this.pn = pn;
    }

    public void run() {
        pn.printOdds();
    }
}
