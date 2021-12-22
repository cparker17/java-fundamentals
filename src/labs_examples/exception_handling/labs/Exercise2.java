package labs_examples.exception_handling.labs;

public class Exercise2 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,0};

        try {
            System.out.println(intArray[5]);
            System.out.println(intArray[3]/intArray[4]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("The index of 5 exceeds the size of the array!");
        } catch (ArithmeticException exc) {
            System.out.println("Can't divide by zero!");
        }
    }
}
