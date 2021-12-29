package labs_examples.lambdas.labs.E1;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

public class LambdaTest {
    public static void main(String[] args) {
        //part 1 and 2
        Interface1 first = () -> System.out.println("This interface does not take in any parameters.");
        first.display();

        Interface1 second = new Interface1() {
            @Override
            public void display() {
                System.out.println("This is the anonymous function version of Interface1 implementation.");
            }
        };

        //part 3 and 4
        Interface2 third = (int x) -> x*x*x;
        System.out.println(third.cube(7));

        Interface2 fourth = new Interface2() {
            @Override
            public int cube(int x) {
                return x*x*x;
            }
        };
        System.out.println(fourth.cube(7));

        //part 5 and 6
        Interface3 fifth = (int x, int y) -> x+y;
        System.out.println(fifth.add(7,17));

        Interface3 sixth = new Interface3() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        };
        System.out.println(sixth.add(7,17));

        //part 7
        DoubleBinaryOperator seventh1 = (double left, double right) -> left + right;
        System.out.println(seventh1.applyAsDouble(100.34532, 85.7384756));

        DoubleConsumer seventh2 = (double value) -> {
            if(value > 10.0) {
                System.out.println(value + " is greater than 10.0");
            } else {
                System.out.println(value + " is less than 10.0");
            }
        };
        seventh2.accept(14.74857);
    }
}
