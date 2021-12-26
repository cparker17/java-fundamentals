package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class Duplex extends House {
    private int numStories;

    public Duplex(String roofType, String sidingType, int size, int bedrooms, boolean backyard, int numStories) {
        super(roofType, sidingType, size, bedrooms, backyard);
        this.numStories = numStories;
    }

    public int getNumStories() {
        return numStories;
    }

    public void setNumStories(int numStories) {
        this.numStories = numStories;
    }

    @Override
    public void parkCar() {
        super.parkCar();
        System.out.println("You can also park your car in the garage.");
    }
}
