package labs_examples.objects_classes_methods.labs.objects.Exercise1_2;

public class Wings {
    int length;
    String color;
    boolean hasStripes;

    @Override
    public String toString() {
        return "Wings{" +
                "length=" + length +
                ", color='" + color + '\'' +
                ", hasStripes=" + hasStripes +
                '}';
    }
}
