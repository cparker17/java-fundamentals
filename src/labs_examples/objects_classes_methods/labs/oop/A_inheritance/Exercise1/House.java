package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

import labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1.Building;

public class House extends Building {
    private int bedrooms;
    private boolean backyard;

    public House(String roofType, String sidingType, int size, int bedrooms, boolean backyard) {
        super(roofType, sidingType, size);
        this.bedrooms = bedrooms;
        this.backyard = backyard;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public boolean isBackyard() {
        return backyard;
    }

    public void setBackyard(boolean backyard) {
        this.backyard = backyard;
    }

    public void parkCar() {
        System.out.println("You can park on the street or in the driveway.");
    }
}
