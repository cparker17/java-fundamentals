package labs_examples.lambdas.labs.E2;

import videos_source_code.classes.Test;

import java.util.function.*;

public class FunctionalInterfacePractice {
    public static void main(String[] args) {
        //1
        DoubleBinaryOperator seventh1 = (double left, double right) -> left + right;
        System.out.println(seventh1.applyAsDouble(100.34532, 85.7384756));

        //2
        DoubleConsumer seventh2 = (double value) -> {
            if(value > 10.0) {
                System.out.println(value + " is greater than 10.0");
            } else {
                System.out.println(value + " is less than 10.0");
            }
        };
        seventh2.accept(14.74857);

        //3
        TestObject obj = new TestObject();
        BiConsumer<String, TestObject> biConsumer = (String val, TestObject test) -> {
            System.out.println("The first argument is of type " + val.getClass());
            System.out.println("The second argument is of type " + test.getClass());
        };
        biConsumer.accept("Hello world", obj);

        //4
        BiFunction<Integer, Integer, Integer> func = (Integer x, Integer y) -> x+y;
        System.out.println(func.apply(5,7));

        //5
        BinaryOperator<Integer> f = (Integer x, Integer y) -> {
            if(x > y) {return x;} else {return y;}
        };
        System.out.println(f.apply(19,5));

        //6
        BiPredicate<String, String> bp = (String one, String two) -> {
            if(one.equalsIgnoreCase(two)) {return true;} else {return false;}
        };
        System.out.println("'Hello' and 'HELLO' are equal: " + bp.test("Hello", "HELLO"));

        //7
        DoublePredicate dp = (double x) -> {
            if(x > 10) {return true;} else {return false;}
        };
        System.out.println("Is 17 greater than 10: " + dp.test(17));

        //8
        DoubleSupplier ds = () -> 13.47586;
        System.out.println("This method returns the double value of: " + ds.getAsDouble());

        //9
        DoubleToIntFunction dtif = (double x) -> (int) x;
        System.out.println("The double value of 12.4532 converted to int is: " + dtif.applyAsInt(12.4532));

        //10
        DoubleToLongFunction dtlf = (double x) -> (long) x;
        System.out.println("The double value of 12.4532 converted to long is: " + dtlf.applyAsLong(12.4532));
    }
}
