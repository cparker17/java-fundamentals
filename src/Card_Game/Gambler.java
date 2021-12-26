package Card_Game;

public interface Gambler {
    public int getInitialPotValue();
    public void setInitialPotValue(int initialPotValue);
    public int getPotValue();
    public String askForBet();
    public void setCurrentBet(int bet);
    public void runGame();
}
