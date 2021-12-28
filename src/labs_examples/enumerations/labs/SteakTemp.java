package labs_examples.enumerations.labs;

public enum SteakTemp {
    RARE(1),
    MEDIUM_RARE(2),
    MEDIUM(3),
    MEDIUM_WELL(4),
    WELL_DONE(5);

    private int menuOption;

    SteakTemp(int menuOption) {
        this.menuOption = menuOption;
    }

    public int getMenuOption() {
        return this.menuOption;
    }
}