package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

import labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1.Building;

public class Office extends Building {
    private int officeSpaces;
    private int tenants;
    private int stories;

    public Office(String roofType, String sidingType, int size, int officeSpaces, int tenants, int stories) {
        super(roofType, sidingType, size);
        this.officeSpaces = officeSpaces;
        this.tenants = tenants;
        this.stories = stories;
    }

    public int getOfficeSpaces() {
        return officeSpaces;
    }

    public void setOfficeSpaces(int officeSpaces) {
        this.officeSpaces = officeSpaces;
    }

    public int getTenants() {
        return tenants;
    }

    public void setTenants(int tenants) {
        this.tenants = tenants;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }

    public void addTenants(int tenants) {
        this.tenants += tenants;
    }

    @Override
    public void cleanWindows() {
        super.cleanWindows();
        System.out.print(" and scaffolding");
    }
}
