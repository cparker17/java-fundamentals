package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Car extends Vehicle {
    private int numWheels;
    private boolean hasGas;

    public Car(String color, int topSpeed, int numWheels, boolean hasGas) {
        super(color, topSpeed);
        this.numWheels = numWheels;
        this.hasGas = hasGas;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public boolean isHasGas() {
        return hasGas;
    }

    public void setHasGas(boolean hasGas) {
        this.hasGas = hasGas;
    }

    public void navigate(String location_1) {
        System.out.println("The car drove to" + location_1);
    }

    //overloaded method below
    public void navigate(String location_1, String location_2) {
        System.out.println("The car drove to " + location_1 + " and then to " + location_2);
    }

    @Override
    public void startEngine() {
        System.out.println("The car engine has been started");
    }
}
