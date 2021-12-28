package labs_examples.generics.labs.E2;
import labs_examples.generics.labs.E2.Demo;

import java.util.ArrayList;

class DemoController {
    public static void main(String[] args) {
        Demo demo = new Demo();
        ArrayList<Integer> intList= new ArrayList<>();
        intList.add(5);
        intList.add(7);
        intList.add(10);
        System.out.println(demo.sumList(intList));

        Demo demo2 = new Demo();
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(12.34);
        doubleList.add(18.34);
        doubleList.add(89.12);
        System.out.println(demo2.sumList(doubleList));


    }
}