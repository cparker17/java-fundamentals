package Card_Game;
import labs_examples.exception_handling.labs.MenuChoiceOutOfBoundsException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CardGameController {
    public static void main(String[] args) {
        CardGame game = new CardGame();
        Scanner input = new Scanner(System.in);

        //set up game based on User input
        game.setCardGameSelection(game);
        game = game.getCardGameSelection();
        game.setNumPlayers();
        game.setIsGambling();
        game.setPlayers();


        //run the particular game selected by User
        int gameNum = 1;
        int menuSelection = 0;
        do {
            //run a game
            game.runGame();
            //Prints out the winner of the hand and the total scores
            System.out.println("Winner of Game #" + gameNum + ": ");
            game.printScoreBoard();
            System.out.println("Would you like to play another hand?");
            System.out.println("   1 - Play Again\n   2 - Quit");
            try {
                menuSelection = input.nextInt();
                if (menuSelection != 1 & menuSelection != 2) {
                    throw new MenuSelectionOutOfBoundsException();
                }
            } catch (MenuSelectionOutOfBoundsException | InputMismatchException exc) {
                System.out.println(exc.toString());
                menuSelection = 0;
            }
            gameNum++;
        } while(menuSelection == 1);

        System.out.println("\n     The winner of the game is " + game.getGameWinner().getName() + "!!!");
    }
}
