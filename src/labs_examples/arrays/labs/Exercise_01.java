package labs_examples.arrays.labs;
import java.util.*;
/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int average = 0;
        int sum = 0;

        System.out.println("Enter 10 numbers: ");
        for (int index : numbers) {
            numbers[index] = input.nextInt();
            sum += numbers[index];
        }
        average = sum / 10;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);

    }
}