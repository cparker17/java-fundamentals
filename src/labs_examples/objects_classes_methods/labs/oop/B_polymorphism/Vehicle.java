package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Vehicle implements VehicleBehavior {
    private String color;
    private int topSpeed;

    public Vehicle(String color, int topSpeed) {
        this.color = color;
        this.topSpeed = topSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void startEngine() {
        System.out.println("The vehicle engine has been started");
    }
}
