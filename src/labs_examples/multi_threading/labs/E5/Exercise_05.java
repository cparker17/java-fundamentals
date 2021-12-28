package labs_examples.multi_threading.labs.E5;

public class Exercise_05 {
    public static void main(String[] args) {
        SampleSync2 ss = new SampleSync2();
        Thread thread1 = new Thread(new SampleThread2(7,3, ss));
        Thread thread2 = new Thread(new SampleThread3(17,4, ss));

        thread1.start();
        thread2.start();

        System.out.println("main has finished running");
    }
}
