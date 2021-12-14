package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14d;
        double height = 5d;
        double pi = Math.PI;

        System.out.println("The surface area is equal to " + (pi*(radius*radius)));
        System.out.println("The volume is equal to " + (height*pi*(radius*radius)));

    }
}