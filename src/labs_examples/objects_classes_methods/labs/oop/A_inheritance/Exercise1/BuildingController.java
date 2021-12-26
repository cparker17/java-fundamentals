package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class BuildingController {
    public static void main(String[] args) {
        Building building = new Building("metal", "concrete", 7000);
        Office office = new Office("rubber", "concrete", 5000, 100, 30, 6);
        House house = new House("shingles", "hardie", 3500, 5, true );
        RowHome rowhome = new RowHome("shingles", "vinyl", 1500, 2, false, true);

        house.parkCar();;
        rowhome.parkCar();
        building.cleanWindows();
        office.cleanWindows();
        System.out.println("The house has " + house.getBedrooms() + " bedrooms.");
        System.out.println("The rowhome has " + rowhome.getBedrooms() + " bedrooms.");

    }
}
