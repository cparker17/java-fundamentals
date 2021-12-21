package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackJackGame;

public class Card {
    private char suit;
    String cardNum;
    private int cardValue;

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public void setCardNum(int i) {
        switch (i) {
            case 0:
                cardNum = "Ace";
                break;
            case 1:
                cardNum = "Two";
                break;
            case 2:
                cardNum = "Three";
                break;
            case 3:
                cardNum = "Four";
                break;
            case 4:
                cardNum = "Five";
                break;
            case 5:
                cardNum = "Six";
                break;
            case 6:
                cardNum = "Seven";
                break;
            case 7:
                cardNum = "Eight";
                break;
            case 8:
                cardNum = "Nine";
                break;
            case 9:
                cardNum = "Ten";
                break;
            case 10:
                cardNum = "Jack";
                break;
            case 11:
                cardNum = "Queen";
                break;
            default:
                cardNum = "King";
                break;
        }
    }

    public String getCardNum() {
        return cardNum;
    }

    public char getSuit() {
        return suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
