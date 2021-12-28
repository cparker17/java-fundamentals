package labs_examples.multi_threading.labs.E6;

public class Exercise_06 {
    public static void main(String[] args) {
        PrintNumbers pn = new PrintNumbers();
        Thread et = new Thread(new EvensThread(pn));
        Thread ot = new Thread(new OddsThread(pn));

        ot.start();
        et.start();
    }

}
