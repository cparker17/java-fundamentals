package labs_examples.arrays.labs;
import java.util.*;
/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int value = input.nextInt();
        for (int i = 0; i <10; i++) {
            if (array[i] == value) {
                System.out.println("The index of that element is " + i);
                break;
            }
        }

    }
}