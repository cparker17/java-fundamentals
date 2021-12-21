package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackJackGame;
import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public Hand(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int returnScore() {
        int score = 0;

        for(Card card : cards) {
            score += card.getCardValue();
        }
        return score;
    }

    public void printCardFace() {
        for(Card card : cards) {
            System.out.print(card.getCardNum());
            System.out.print(card.getSuit() + "  ");
        }
        System.out.println();
    }

    public boolean is21(int score) {
        if(score > 21) {
            return true;
        } else {
            return false;
        }
    }
}
