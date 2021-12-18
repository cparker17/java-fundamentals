package labs_examples.objects_classes_methods.labs.objects.Exercise3;

public class CarController {
    public static void main(String[] args) {
        Car car = new Car();
        Salesman salesman = new Salesman();
        System.out.println("Chris bought his " + car.model + " from " + salesman.dealershipName + "!");
    }
}
