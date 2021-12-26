package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class Building {
    private String roofType;
    private String sidingType;
    private int size;
    private boolean lights;

    public Building(String roofType, String sidingType, int size) {
        this.roofType = roofType;
        this.sidingType = sidingType;
        this.size = size;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }

    public void setSidingType(String sidingType) {
        this.sidingType = sidingType;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getRoofType() {
        return roofType;
    }

    public String getSidingType() {
        return sidingType;
    }

    public int getSize() {
        return size;
    }

    public void turnLightsOn() {
        this.lights = true;
    }

    public void turnLightsOff() {
        this.lights = false;
    }

    public void cleanWindows() {
        System.out.println("The windows are cleaned with Windex");
    }

}
