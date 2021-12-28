package labs_examples.generics.labs.E3;

import java.lang.instrument.Instrumentation;
import java.util.Collection;
import java.util.List;



public class GenericMethods {
    public <T extends Number> double sum(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public <T extends Collection<String>> void countPalin(T collection) {
        boolean isPalin = false;
        int palinCount = 0;
        int j = 0;
        for(String elem : collection) {
            j = elem.length() - 1;
            for(int i = 0; i < elem.length()/2; i++) {
                if (elem.charAt(i) != elem.charAt(j)) {
                    isPalin = false;
                    break;
                }
                j--;
                isPalin = true;
            }
            if(isPalin) {
                palinCount++;
            }
        }
        System.out.println("Palindromes in collection = " + palinCount);
    }

    public <T> void exchangeElem(T[] s, int elem1, int elem2) {
        //print out original array
        System.out.println("Initial Array: " );
        for(T elem : s) {
            System.out.print(elem + " ");
        }

        //swap elements
        T temp = s[elem1];
        s[elem1] = s[elem2];
        s[elem2] = temp;

        //print out new array after swapping elements
        System.out.println("\nArray after exchanging element# " + elem1 + " and element# " + elem2);
        for(T elem : s) {
            System.out.print(elem + " ");
        }
    }

    public <T extends Number> void largestElem(List<T> list, int begin, int end) {
        int maxElement = begin;

        for (int i = begin+1; i <= end; i++) {
            if (list.get(maxElement).intValue() < list.get(i).intValue()) {
                maxElement = i;
            }
        }

        System.out.println("\n\nThe largest element in this List is element# " + maxElement);
    }
}
