package labs_examples.objects_classes_methods.labs.oop.C_blackjack.BlackJackGame;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            BlackjackController blackjackGame = new BlackjackController();
            blackjackGame.playBlackJack();
            System.out.println("You have played " + blackjackGame.getGamesPlayed() + " Blackjack games.");
            System.out.println("Type 1 if you would like to play again: ");
        } while (input.nextInt() == 1);
    }
}
