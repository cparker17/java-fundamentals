package labs_examples.arrays.labs;
import java.util.*;
/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Chris");
        list.add("Alina");
        list.add("Olivia");
        list.add("Ethan");

        if(list.contains("Ethan")) {
            System.out.println("Ethan is in the list!");
        }
        System.out.println("Alina is at index #: " + list.get(1));
        System.out.println(list.toString());
    }
}
