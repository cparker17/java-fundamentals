package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class RowHome extends House {
    private boolean endUnit;

    public RowHome(String roofType, String sidingType, int size, int bedrooms, boolean backyard, boolean endUnit) {
        super(roofType, sidingType, size, bedrooms, backyard);
        this.endUnit = endUnit;
    }

    public boolean isEndUnit() {
        return endUnit;
    }

    public void setEndUnit(boolean endUnit) {
        this.endUnit = endUnit;
    }

    @Override
    public void parkCar() {
        System.out.println("You can only park your car on the street.");
    }
}
