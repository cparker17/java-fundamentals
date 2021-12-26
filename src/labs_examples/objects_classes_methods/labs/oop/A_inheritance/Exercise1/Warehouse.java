package labs_examples.objects_classes_methods.labs.oop.A_inheritance.Exercise1;

public class Warehouse extends Building {
    private String materialStored;
    private int tenants;

    public Warehouse(String roofType, String sidingType, int size, String materialStored) {
        super(roofType, sidingType, size);
        this.materialStored = materialStored;
    }

    public String getMaterialStored() {
        return materialStored;
    }

    public void setMaterialStored(String materialStored) {
        this.materialStored = materialStored;
    }

    public void addTenants(int tenants) {
        this.tenants += tenants;
    }
}
