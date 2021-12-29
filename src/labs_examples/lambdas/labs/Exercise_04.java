package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lambdas Exercise 4:
 *
 *      Stream API Labs
 *
 *      1) Demonstrate the use of the range function to print out the numbers 1 through 15 (inclusive)
 *      2) Demonstrate the use of the sum function to determine the range of a set of numbers.
 *      3) Demonstrate the use of the map() function to alter each int in a List of Integers, then use the sum function
 *          to get the sum of the modified list
 *      4) Demontrate the filter function by filtering out all Integers that are less than 10 - then use the average
 *          function to average the remaining numbers, assign this result to an int variable.
 *      5) Demonstrate the reduce() function to determine the sum of a list of Integers
 *      6) Demontsrate how to Stream a text file and print out each line
 *      7) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the element at the 1 index for each array.
 *      8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
 *          the print out the sum of all elements at index 2.
 *      9) Demonstrate the anyMatch() function.
 *      10) Demonstrate the allMatch() function.
 *      11) Demonstrate the collect() terminal operation to store resulting values into a List
 *      
 */

class Example {
    public static void main(String[] args) {
        //part 1
        IntStream
                .range(1,16)
                .forEach(x -> System.out.println(x));

        //part 2
        int sum = IntStream
                .range(7,17)
                .sum();
        System.out.println("The sum of all integers from 7 to 17 is " + sum);

        //part 3
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(14);
        list.add(26);
        Integer s = list.stream()
                .mapToInt(x -> (x+1))
                .sum();
        System.out.println(s.toString());

        //part 4
        int average = (int) list.stream()
                .mapToInt(x -> x)
                .filter(x -> x < 10)
                .average().getAsDouble();
        System.out.println(average);

        //part 5
        System.out.println(list.stream()
                .reduce(0, (x,y) -> x +y));

        //part 6
        String statesFile = "/Users/chrisparker/Documents/CodingNomads/labs/online-java-fundamentals/" +
                "src/labs_examples/lambdas/labs/test_file.txt";
        try {
            Stream<String> states = Files.lines(Paths.get(statesFile));
            states.forEach(System.out::println);
            states.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //part 7
        String streamFile = "/Users/chrisparker/Documents/CodingNomads/labs/online-java-fundamentals/" +
                "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        try {
            Stream<String> file = Files.lines(Paths.get(streamFile));
            file
                    .map(x -> x.split(","))
                    .forEach(x -> System.out.print(x[1]));
            file.close();
            } catch (IOException e) {
            e.printStackTrace();
        }

        //part 8
        System.out.println();
        try {
            Stream<String> file2 = Files.lines(Paths.get(streamFile));
            Double sum2 = file2
                    .map(x -> x.split(","))
                    .mapToDouble(x -> Double.parseDouble(x[2]))
                    .sum();
            file2.close();
            System.out.println(sum2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //part 9
        boolean numExist = list.stream().anyMatch(x -> x == 14);
        System.out.println("Does the list contain the number 14: " + numExist);

        //part 10
        boolean allEven = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println("Are all of the numbers in the list even: " + allEven);

        //part 11
        List<Integer> over10 = list.stream()
                .filter(x -> x > 10)
                .collect(Collectors.toList());
        over10.stream().forEach(System.out::println);
    }
}