package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try {
            System.out.println(divide(7,0));
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by zero!");
        }
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a/b;
    }

}