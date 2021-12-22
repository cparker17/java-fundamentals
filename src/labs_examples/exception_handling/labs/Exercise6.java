package labs_examples.exception_handling.labs;

public class Exercise6 {
    public static void main(String[] args) {
        try {
            System.out.println(divide(7,0));
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by zero!");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return divide_2(a,b);
    }

    public static int divide_2(int a, int b) {
        try {
            return a/b;
        } catch (ArithmeticException exc) {
            throw exc;
        }
    }
}
