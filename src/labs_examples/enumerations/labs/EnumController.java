package labs_examples.enumerations.labs;

import java.util.Locale;

public class EnumController {
    public static void main(String[] args) {
        //part 1
        SteakTemp chrisTemp = SteakTemp.MEDIUM_RARE;
        SteakTemp alinaTemp = SteakTemp.MEDIUM;
        System.out.println("Chris likes his steak " + chrisTemp.toString().toLowerCase(Locale.ROOT) + ".");
        System.out.println("Alina likes her steak " + alinaTemp.toString().toLowerCase(Locale.ROOT) + ".");

        //part 2
        System.out.println("Chris's preferred temp is menu #" + chrisTemp.getMenuOption());
        System.out.println("Alina's preferred temp is menu #" + alinaTemp.getMenuOption());
    }
}
