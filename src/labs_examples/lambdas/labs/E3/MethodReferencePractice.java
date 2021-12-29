package labs_examples.lambdas.labs.E3;

import labs_examples.lambdas.labs.E1.Interface3;
import videos_source_code.classes.Test;

import java.util.function.BiFunction;

public class MethodReferencePractice {
    public static void main(String[] args) {
        //1
        BiFunction<Integer, Integer, Integer> methodOne = MethodReferencePractice :: multiply;
        System.out.println("7 times 17 eqauals: " + methodOne.apply(7,17));

        //2
        TestObject2 obj = new TestObject2();
        DisplayFunction df = obj :: display;
        df.display();

        //3
        TestObject2Creator objCreator = TestObject2 :: new;
        TestObject2 obj2 = objCreator.create(7);
        System.out.println(obj2.getX());

    }

    //static method used in part one in main()
    public static int multiply(int x, int y) {
        return x*y;
    }
}
