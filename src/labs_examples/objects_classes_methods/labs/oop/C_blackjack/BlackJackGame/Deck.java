package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackJackGame;
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private char[] suits = {'\u2660', '\u2662', '\u2665', '\u2663'};
    private Card[] cards = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList<>();
    Random randomNumber = new Random();

    public Deck() {}

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }

    public void populateCardDeck() {
        int cardIndex = 0;
        for(int s =0; s <4; s++) {
            for(int i = 0; i < 10; i++) {
                Card card = new Card(suits[s], cardIndex);
                card.setCardNum(i);
                card.setCardValue(i+1);
                this.cards[cardIndex] = card;
                cardIndex++;
            }
            for(int i = 10; i < 13; i++) {
                Card card = new Card(suits[s], cardIndex);
                card.setCardNum(i);
                card.setCardValue(10);
                this.cards[cardIndex] = card;
                cardIndex++;
            }
        }
    }

    public void dealCard(Player player) {
        int cardDealt = 0;
        usedCards.add(cardDealt);
        do {
            cardDealt = randomNumber.nextInt(51);
            for(int i = 0; i < usedCards.size(); i++) {
                if(cardDealt == usedCards.get(i)) {
                    cardDealt = 0;
                    break;
                }
            }
        } while(cardDealt == 0);
        player.getHand().getCards().add(cards[cardDealt]);
        usedCards.add(cardDealt);
    }
}
