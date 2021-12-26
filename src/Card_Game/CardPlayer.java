package Card_Game;

import java.util.ArrayList;

public class CardPlayer {
    private String name;
    private int playerNumber;
    private boolean isBust;
    private boolean isGambler;
    private int initialPotValue;
    private int potValue;
    private int currentBet;
    private ArrayList<Card> cardsInHand;
    private int handValue;
    private int gamesWon;

    public CardPlayer(String name, int playerNumber) {
        cardsInHand = new ArrayList<>();
        this.name = name;
        this.playerNumber = playerNumber;
        isBust = false;
        handValue = 0;
    }

    public CardPlayer(String name, int playerNumber, int initialPotValue) {
        this.name = name;
        this.playerNumber = playerNumber;
        isBust = false;
        this.initialPotValue = initialPotValue;
        cardsInHand = new ArrayList<>();
        handValue = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public boolean isBust() {
        return isBust;
    }

    public void setBust(boolean isBust) {
        this.isBust = isBust;
    }

    public boolean isGambler() {
        return isGambler;
    }

    public void setGambler(boolean gambler) {
        isGambler = gambler;
    }

    public int getInitialPotValue() {
        return initialPotValue;
    }

    public void setInitialPotValue(int initialPotValue) {
        this.initialPotValue = initialPotValue;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }

    public int getCurrentBet() {
        return currentBet;
    }

    public void setCurrentBet(int currentBet) {
        this.currentBet = currentBet;
    }

    public void addCardToHand(Card card) {
        cardsInHand.add(card);
    }
    public int getHandValue() {
        handValue = 0;
        for(Card card : cardsInHand) {
            handValue += card.getCardValue();
        }

        return handValue;
    }

    public void printHand() {
        System.out.println("Player #" + getPlayerNumber() + ":");
        System.out.println(getName() + "'s hand includes:");
        for(Card card : cardsInHand) {
            System.out.print(card.getCardFace());
            System.out.print(card.getSuit() + "  ");
        }
        System.out.println("Score: " + getHandValue());
    }

    public boolean isHandOver21() {
        if(getHandValue() > 21) {
            return true;
        } else {
            return false;
        }
    }
    public int getGamesWon() {
        return gamesWon;
    }

    public void addGameWon() {
        gamesWon++;
    }

    public void resetHand() {
        cardsInHand.removeAll(cardsInHand);
    }
}
