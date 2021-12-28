package labs_examples.generics.labs.E1;

public class Exercise_01 {
    public static void main(String[] args) {
        GenericTest<String> test1 = new GenericTest();
        GenericTest<Integer> test2 = new GenericTest();
        GenericTest<Double> test3 = new GenericTest();

        //adding two strings together
        test1.setValue1("adding");
        test1.setValue2("together");
        System.out.println(test1.getValue1() + " " + test1.getValue2());

        //adding two integers together
        test2.setValue1(7);
        test2.setValue2(17);
        int sumInt = test2.getValue1() + test2.getValue2();
        System.out.println(sumInt);

        //adding two doubles together
        test3.setValue1(14.234);
        test3.setValue2(17.986);
        double sumDouble = test3.getValue1() + test3.getValue2();
        System.out.println(sumDouble);
    }
}
