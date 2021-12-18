package labs_examples.objects_classes_methods.labs.objects.Exercise4;

public class TVController {
    public static void main(String[] args) {
        TV tv1 = new TV(true);
        TV tv2 = new TV(true, "Samsung");
        TV tv3 = new TV(true, "Samsung", 75);

        System.out.println(tv1.toString());
        System.out.println(tv2.toString());
        System.out.println(tv3.toString());
    }
}
