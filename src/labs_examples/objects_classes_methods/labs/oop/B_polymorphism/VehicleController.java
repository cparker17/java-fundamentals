package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class VehicleController {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("black", 100);
        Car car = new Car("white", 120, 4, true);
        VehicleBehavior vehicleBehavior = new Car("black", 150, 4,true);
        VehicleBehavior vehicleBehavior2 = new Vehicle("green",85);
        vehicleBehavior.startEngine();
        vehicleBehavior2.startEngine();
        Garage garage = new Garage(vehicleBehavior);

    }
}
