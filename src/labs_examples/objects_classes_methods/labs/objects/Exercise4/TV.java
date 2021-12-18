package labs_examples.objects_classes_methods.labs.objects.Exercise4;

public class TV {
    public boolean isOn;
    public String brand;
    public int size;

    public TV(boolean isOn) {

        this.isOn = isOn;
    }
    public TV(boolean isOn, String brand) {
        this.isOn = isOn;
        this.brand = brand;
    }
    public TV(boolean isOn, String brand, int size) {
        this.isOn = isOn;
        this.brand = brand;
        this.size = size;
    }

    @Override
    public String toString() {
        return "TV{" +
                "isOn=" + isOn +
                ", brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }
}
