package labs_examples.multi_threading.labs.E4;

public class Exercise_04 {
    public static void main(String[] args) {
        SampleSync ss = new SampleSync();
        SampleThread thread1 = new SampleThread(7,3, ss, true);
        SampleThread thread2 = new SampleThread(17,4, ss, false);

        thread1.run();
        thread2.run();

        System.out.println("main has finished running");
    }
}
