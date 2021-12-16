package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();
        int wordLength = word.length();
        int index = 0;

        while (index <= wordLength) {
            char letter = word.charAt(index);
            char firstVowel = 'x';

            switch (letter) {
                case 'a':
                    firstVowel = letter;
                    break;
                case 'e':
                    firstVowel = letter;
                    break;
                case 'i':
                    firstVowel = letter;
                    break;
                case 'o':
                    firstVowel = letter;
                    break;
                case 'u':
                    firstVowel = letter;
                    break;
                default:
                    break;
            }

            if (firstVowel != 'x') {
                System.out.println("The first vowel in the word '" + word + "' is '" + firstVowel);
                break;
            }
            index++;
        }


    }
}
