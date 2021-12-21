package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackJackGame;

public class Player {
    private String name;
    private Hand hand;
    private int potValue;
    private static int gamesWon = 0;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;
    }

    public void updateGamesWon() {
        gamesWon += 1;
    }

    public int getGamesWon() {
        return gamesWon;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public boolean computerAI(int score) {
        if(score < 16) {
            return true;
        } else {
            return false;
        }
    }
}
