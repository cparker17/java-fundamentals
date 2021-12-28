package labs_examples.generics.labs.E2;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 * <p>
 * Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 * Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

public class Demo {
    public <T extends Number> double sumList(ArrayList<T> list) {
        double sum = 0;
        for (T elem : list) {
            System.out.println(elem);
            sum += elem.doubleValue();
        }
        return sum;
    }
}
