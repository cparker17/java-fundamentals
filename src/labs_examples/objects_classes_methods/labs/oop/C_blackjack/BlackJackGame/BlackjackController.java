package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackJackGame;
import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        playBlackJack();
    }

    public static void playBlackJack() {
        //get input from user to set up player
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        Player player = new Player(input.next());

        //set up the dealer
        Player computer = new Player("Dealer");

        //set up the deck of cards
        Deck deck = new Deck();
        deck.populateCardDeck();

        //set up the player's hand and the dealer's hand
        Hand playerHand = new Hand();
        Hand computerHand = new Hand();
        player.setHand(playerHand);
        computer.setHand(computerHand);

        //deal two cards to the player and two to the dealer
        deck.dealCard(player);
        deck.dealCard(player);
        deck.dealCard(computer);
        deck.dealCard(computer);

        //loop to deal more cards to the player
        int menuSelection = 0;
        do {
            System.out.println(player.getName() + "'s hand includes:");
            playerHand.printCardFace();
            System.out.println("Score: " + playerHand.returnScore());
            System.out.println("Do you want another card?");
            System.out.print("     Press 1 for yes and 2 for no: ");
            menuSelection = input.nextInt();
            if (menuSelection == 1) {
                deck.dealCard(player);
            } else {
                System.out.println(player.getName() + " holds.");
            }
            if (playerHand.is21(playerHand.returnScore())) {
                System.out.println(playerHand.returnScore() + "...Bust!");
                menuSelection = -1;
            }
        } while(menuSelection == 1);

        //loop to deal more cards to dealer
        System.out.println("Dealer's hand:");
        computerHand.printCardFace();
        if(!playerHand.is21(playerHand.returnScore())) {
            while (computer.computerAI(computerHand.returnScore())) {
                deck.dealCard(computer);
                System.out.println("\nThe dealer took another card.");
                computerHand.printCardFace();
                System.out.println(computerHand.returnScore());
                if (computerHand.is21(computerHand.returnScore())) {
                    System.out.println(computerHand.returnScore() + "...Dealer bust!");
                }
            }
            System.out.println("Dealer holds.");
        }

        //display final hand of player and dealer
        playerHand.printCardFace();
        System.out.println(player.getName() + " has a score of: " + playerHand.returnScore());
        computerHand.printCardFace();

        //determines winner of the game
        System.out.println("Dealer has a score of: " + computerHand.returnScore());
        if(playerHand.is21(playerHand.returnScore()) & computerHand.is21(computerHand.returnScore())) {
            System.out.println("Both dealer and " + player.getName() + " lose.");
        } else if (playerHand.is21(playerHand.returnScore()) & !computerHand.is21(computerHand.returnScore())) {
            System.out.println("\n   Dealer wins!!!");
        } else if (computerHand.is21(computerHand.returnScore()) & !playerHand.is21(playerHand.returnScore())) {
            System.out.println("\n   " + player.getName() + " wins!!!");
        } else if (playerHand.returnScore() > computerHand.returnScore()) {
            System.out.println("\n   " + player.getName() + " wins!!!");
        } else if (computerHand.returnScore() > playerHand.returnScore()) {
            System.out.println("\n   Dealer wins!!!");
        } else {
            System.out.println("Both dealer and " + player.getName() + " lose.");
        }
    }
}
