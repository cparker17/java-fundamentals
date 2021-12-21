package labs_examples.static_nonstatic.labs;
import java.util.Scanner;

public class ClassController {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //1. create an object of each class
        Class_1 class_1 = new Class_1();
        Class_2 class_2 = new Class_2();
        ClassController classController = new ClassController();

        //2. a static method calling another static method in the same class
        System.out.println(add(7,7));

        //3. a static method calling a non-static method in the same class
        System.out.println(classController.multiply(7,3));

        //4. a static method calling another static method in another class
        System.out.println(Class_1.add(7,10));

        classController.multiply();
        classController.divide();
        classController.printAdd(3,2);
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public void multiply() {
        System.out.println("Enter two numbers to multiply:");
        //5. a non-static method calling a non-static method in the same class
        System.out.println(multiplyInput(scanner.nextInt(), scanner.nextInt()));
    }

    public int multiplyInput(int a, int b) {
        return a*b;
    }

    public void divide() {
        //6.a non static method calling a non-static method in another class
        Class_1 class_test = new Class_1();
        class_test.printDivision(20,2);
    }

    public int printAdd(int a, int b) {
        //7.a non static method calling a static method in the same class
        System.out.println(add(a,b));

        //8.a non-static method calling a static method in another class
        return Class_2.add(a,b);
    }

}
