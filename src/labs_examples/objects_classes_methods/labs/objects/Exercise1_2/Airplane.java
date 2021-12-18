package labs_examples.objects_classes_methods.labs.objects.Exercise1_2;

public class Airplane {
    private Cabin cabin;
    private Engine engine;
    private LandingGear landingGear;
    private Wings wings;
    private double fuelCapacity;
    private double currentFuelLevel;

    @Override
    public String toString() {
        return "Airplane{" +
                "cabin=" + cabin +
                ", engine=" + engine +
                ", landingGear=" + landingGear +
                ", wings=" + wings +
                ", fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                '}';
    }
}
