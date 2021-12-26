package labs_examples.multi_threading.labs.E2;

public class Exercise_02 {
    public static void main(String[] args) {
        NewThread2 t1 = new NewThread2();
        t1.start();

        NewThread2 t2 = new NewThread2();
        t2.start();
    }
}
