package labs_examples.multi_threading.labs.E4;

public class SampleThread implements Runnable {
    private int a,b;
    private SampleSync ss;
    private boolean opt;

    public SampleThread(int a, int b, SampleSync ss, boolean opt) {
        this.a = a;
        this.b = b;
        this.ss = ss;
        this.opt = opt;
    }
    public void run() {
        //remove commented code below and remove "synchronized" from SampleSync to run program with
        //synchronized block instead of synchronized method
        //synchronized (ss) {
            int sum = ss.add(a, b, opt);
            System.out.println("A + B = " + sum);
        //}
    }
}
