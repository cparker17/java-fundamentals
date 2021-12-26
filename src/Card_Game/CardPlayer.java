package Card_Game;

import java.util.ArrayList;

public class CardPlayer {
    private String name;
    private boolean isGambler;
    private int initialPotValue;
    private int potValue;
    private int currentBet;
    private ArrayList<Card> cardsInHand;
    private int handValue;
    private int gamesWon;

    public CardPlayer(String name) {
        cardsInHand = new ArrayList<>();
        this.name = name;
        handValue = 0;
    }

    public CardPlayer(String name, int initialPotValue) {
        this.name = name;
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
        return handValue;
    }

    public void updateHandValue() {
        for(Card card : cardsInHand) {
            handValue += card.getCardValue();
        }
    }

    public void printHand() {
        for(Card card : cardsInHand) {
            System.out.print(card.getCardFace());
            System.out.print(card.getSuit() + "  ");
        }
        System.out.println();
    }

    public boolean isHandOver21() {
        if(handValue > 21) {
            return true;
        } else {
            return false;
        }
    }
    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }
}
