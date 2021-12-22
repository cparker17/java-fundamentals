package labs_examples.exception_handling.labs;

public class Exercise1 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        try {
            System.out.println(intArray[5]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("The index of 5 exceeds the size of the array!");
        }
    }
}
