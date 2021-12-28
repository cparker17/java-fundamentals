package labs_examples.multi_threading.labs.E5;

public class SampleThread3 implements Runnable {
    private int a,b;
    private SampleSync2 ss;

    public SampleThread3(int a, int b, SampleSync2 ss) {
        this.a = a;
        this.b = b;
        this.ss = ss;
    }
    public void run() {
        for(int i = 0; i < 3; i++) {
            int total = ss.subtract(a, b);
            System.out.println("A - B = " + total);
        }
    }
}
