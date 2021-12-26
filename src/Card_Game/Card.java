package Card_Game;

public class Card {
    private String cardFace;
    private char suit;

    public Card(String cardFace, char suit) {
        this.cardFace = cardFace;
        this.suit = suit;
    }

    public String getCardFace() {
        return cardFace;
    }

    public char getSuit() {
        return suit;
    }

    public int getCardValue() {
        return switch (cardFace) {
            case "Ace" -> 1;
            case "Two" -> 2;
            case "Three" -> 3;
            case "Four" -> 4;
            case "Five" -> 5;
            case "Six" -> 6;
            case "Seven" -> 7;
            case "Eight" -> 8;
            case "Nine" -> 9;
            default -> 10;
        };
    }
}
