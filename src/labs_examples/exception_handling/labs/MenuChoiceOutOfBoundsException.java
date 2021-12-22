package labs_examples.exception_handling.labs;

public class MenuChoiceOutOfBoundsException extends Exception {
    @Override
    public String toString() {
        return "Menu choice is outside of the range.";
    }
}
