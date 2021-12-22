package labs_examples.exception_handling.labs;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner menuSelection = new Scanner(System.in);
        System.out.println("Please select from the following menu options:");
        System.out.println("   1 - Plain Bagel\n   2 - Bagel w/ Cream Cheese\n   3 - Eggs & Bacon\n");
        try {
            customExceptionExample(menuSelection.nextInt());
        } catch (MenuChoiceOutOfBoundsException exc) {
            System.out.println("Menu choice is outside of the range. Please select again...");;
        }
    }

    public static void customExceptionExample(int menuSelection) throws MenuChoiceOutOfBoundsException {
        if (menuSelection >= 1 && menuSelection <= 3) {
            System.out.println("You selected menu item: " + menuSelection);
        } else {
            throw new MenuChoiceOutOfBoundsException();
        }
    }
}


