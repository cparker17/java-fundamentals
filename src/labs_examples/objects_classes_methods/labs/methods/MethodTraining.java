package labs_examples.objects_classes_methods.labs.methods;
import java.util.*;

public class MethodTraining {
    public static void main(String[] args) {
        //1) Demonstrate method overloading in this class
        System.out.println(add(2,3));
        System.out.println(add(2,3,4));

        //2) Demonstrate the difference between "pass by value" and "pass by reference"
        int a = 2;
        System.out.println(passByValue(a));
        System.out.println(a);
        int[] intArray = {1,2,3,4,5};
        passByReference(intArray);
        for(int x=0; x < intArray.length; x++) {
            System.out.print(intArray[x] + " ");
        }
        System.out.println();

        //3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
        System.out.println(returnLargestNum(7,4,19,1));

        //4) Write a method to count all consonants (the opposite of vowels) in a String
        System.out.println(countConsonants("Christopher"));

        //5) Write a method that will determine whether or not a number is prime
        System.out.println(isPrime(19));

        //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
        //which is passed in as an argument
        int[] testArray = {3,7,14,76,34,10};
        int[] minMaxArray = minMax(testArray);
        System.out.println("The lowest number is: " + minMaxArray[0]);
        System.out.println("The highest number is: " + minMaxArray[1]);

        //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        //In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        //divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        //length of the returned list
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = getList(20,4,2);
        System.out.println(list.toArray().length);

        //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        //instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        //variable is used to temporarily store individual values in the array
        int[] intList = {1,2,3,4,5,6,7};
        reverseArray(intList);
        for (int i = 0; i < intList.length; i++) {
            System.out.print(intList[i] + " ");
        }

    }

    //1) Demonstrate method overloading in this class
    public static int add(int a, int b) {
        return a + b;
    }
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    //2) Demonstrate the difference between "pass by value" and "pass by reference"
    public static int passByValue(int a) {
        int b = 7;
        a += 7;
        return a;
    }

    public static void passByReference(int[] intArray) {
        int[] a = {6,7,8,9,10};
        for(int x = 0; x < intArray.length; x++) {
            intArray[x] = a[x];
            System.out.print(intArray[x] + " ");
        }
        return;
    }

    //3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int returnLargestNum(int a, int b, int c, int d) {
        int target = 0;
        if ( a > b) {
            target = a;
        } else {
            target = b;
        }
        if (c > target) {
            target = c;
        } else if (d > target) {
            target = d;
        }
        return target;
    }

    //4) Write a method to count all consonants (the opposite of vowels) in a String
    public static int countConsonants(String word) {
        int counter = 0;
        char[] vowels = {'a','A','e','E','i','I','o','O','u','U'};
        int wordLength = word.length();

        for(int i = 0; i < wordLength; i++) {
            switch (word.charAt(i)) {
                case 'a': break;
                case 'A': break;
                case 'e': break;
                case 'E': break;
                case 'i': break;
                case 'I': break;
                case 'o': break;
                case 'O': break;
                case 'u': break;
                case 'U': break;
                default: counter++;
            }
        }
        return counter;
    }

    //5) Write a method that will determine whether or not a number is prime
    public static boolean isPrime(int number) {
        int factorCounter = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                factorCounter++;
            }
        }
        if (factorCounter == 0) {
            return true;
        } else return false;
    }

    //6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    //which is passed in as an argument
    public static int[] minMax(int[] intArray) {
        int tempMin = intArray[0];
        int tempMax = intArray[0];

        for (int i = 1; i < intArray.length; i++) {
            if (tempMin < intArray[i]) {
                tempMin = intArray[i];
            }
        }
        for (int i = 1; i < intArray.length; i++) {
            if (tempMax > intArray[i]) {
                tempMax = intArray[i];
            }
        }
        int[] minMaxArray = {tempMin, tempMax};
        return minMaxArray;
    }

    //7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    //In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    //divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    //length of the returned list
    public static ArrayList<Integer> getList(int maxNum, int divisor1, int divisor2) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= maxNum; i++) {
            if (i%divisor1 == 0 & i%divisor2 ==0) {
                list.add(i);
            }
        }
        return list;
    }

    //8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //variable is used to temporarily store individual values in the array
    public static void reverseArray(int[] intArray) {
        int temp = 0;
        for (int i = 0; i < intArray.length/2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[intArray.length-(i+1)];
            intArray[intArray.length - (i+1)] = temp;
        }
    }
}
