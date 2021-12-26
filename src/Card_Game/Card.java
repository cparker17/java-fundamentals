package Card_Game;

public class Card {
    private String cardFace;
    private char suit;
    private int cardValue;

    public Card() {}

    public Card(String cardFace, char suit) {
        this.cardFace = cardFace;
        this.suit = suit;
    }

    public String getCardFace() {
        return cardFace;
    }

    public void setCardFace(String cardFace) {
        this.cardFace = cardFace;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        switch (cardFace) {
            case "Ace":
                return 1;
            case "Two":
                return 2;
            case "Three":
                return 3;
            case "Four":
                return 4;
            case "Five":
                return 5;
            case "Six":
                return 6;
            case "Seven":
                return 7;
            case "Eight":
                return 8;
            case "Nine":
                return 9;
            default:
                return 10;
        }
    }
}
