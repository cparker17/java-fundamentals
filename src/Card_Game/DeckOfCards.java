package Card_Game;
import java.util.Random;

import labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackJackGame.Player;

import java.util.ArrayList;

public class DeckOfCards {
    private static final String[] CARDFACES = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private static final char[] SUITS = {'\u2660', '\u2662', '\u2665', '\u2663'};
    private Card[] cardDeck;
    private ArrayList<Card> usedCards;

    public DeckOfCards() {
        cardDeck = new Card[52];
        usedCards = new ArrayList<>();
        populateCardDeck();
    }

    public void populateCardDeck() {
        int i = 0;
        for (char suit : SUITS) {
            for (String cardFace : CARDFACES) {
                Card card = new Card(cardFace, suit);
                cardDeck[i++] = card;
            }
        }
    }

    public void dealCard(CardPlayer player) {
        Random randomNumber = new Random();
        Card cardDealt;
        if(usedCards.size() == 0) {
            cardDealt = cardDeck[randomNumber.nextInt(51)];
            usedCards.add(cardDealt);
            player.addCardToHand(cardDealt);
        } else {
            do {
                cardDealt = cardDeck[randomNumber.nextInt(51)];
                    for (Card usedCard : usedCards) {
                        if (cardDealt == usedCard) {
                            cardDealt = null;
                            break;
                        }
                    }
            } while (cardDealt == null);
            player.addCardToHand(cardDealt);
            usedCards.add(cardDealt);
        }
    }

    public void resetDeck() {
        usedCards.removeAll(usedCards);
    }
}


