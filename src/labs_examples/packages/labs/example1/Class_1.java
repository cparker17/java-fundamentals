package labs_examples.packages.labs.example1;

import labs_examples.packages.labs.example2.Class_2;

public class Class_1 {
    public static void main(String[] args) {
        Class_2 class2 = new Class_2();
        class2.multiply2(7,17);
        //cannot call protected method in another package
        //class2.multiply(3,4);
    }

}
