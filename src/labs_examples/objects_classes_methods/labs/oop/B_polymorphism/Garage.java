package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Garage {
    private VehicleBehavior car;

    public Garage(VehicleBehavior car) {
        this.car = car;
    }

    public VehicleBehavior getCar() {
        return car;
    }

    public void setCar(VehicleBehavior car) {
        this.car = car;
    }
}
