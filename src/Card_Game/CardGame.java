package Card_Game;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CardGame {
    private DeckOfCards cardDeck;
    private boolean isDealerCardPlayer;
    private Scanner input = new Scanner(System.in);
    private CardGame cardGameSelection;
    private String name;
    private int numPlayers;
    protected ArrayList<CardPlayer> players;
    private CardPlayer gameWinner;
    protected CardPlayer handWinner;

    public CardGame() {
        cardDeck = new DeckOfCards();
        players = new ArrayList<CardPlayer>();
        numPlayers = 0;
    }

    public DeckOfCards getCardDeck() {
        return cardDeck;
    }

    public boolean isDealerCardPlayer() {
        return isDealerCardPlayer;
    }

    public void setIsDealerCardPlayer(boolean dealerCardPlayer) {
        isDealerCardPlayer = dealerCardPlayer;
    }

    public CardGame getCardGameSelection() {
        return cardGameSelection;
    }

    public void setCardGameSelection(CardGame game) {
        int i = 0;

        do {
            System.out.println("Which card game would you like to play?");
            System.out.println("   1 - Blackjack\n   2 - Poker\n   3 - Quit");
            System.out.println("Enter Selection: ");
            try {
                i = input.nextInt();
                switch (i) {
                    case 1:
                        cardGameSelection = new BlackJackGame();
                        System.out.println("Let's play some Blackjack!");
                        break;
                    case 2:
                        System.out.println("This game is not ready yet.  Please select again.");
                        break;
                    case 3:
                        System.exit(1);
                    default:
                        i = -1;
                        throw new MenuSelectionOutOfBoundsException();
                }
            } catch (MenuSelectionOutOfBoundsException | InputMismatchException exc) {
                System.out.println(exc.toString());
                System.out.println("Please try again.\n");
            }
        } while(i < 1 || i > 2);
    }

    public void setIsGambling() {

    }

    public void setNumPlayers() {
        int i = 0;
        do {
            System.out.println("Please enter the number of players between 1 and 4 that will participate in the game: ");
            try {
                numPlayers = input.nextInt();
                if (numPlayers < 1 || numPlayers > 4) {
                    i = -1;
                    throw new InputOutOfBoundsException();
                }
            } catch (InputOutOfBoundsException | InputMismatchException exc) {
                System.out.println(exc.toString());
                System.out.println("Please try again.\n");
            }
        } while (i == -1);
    }

    public void setPlayers() {
        CardPlayer player;
        System.out.println("Let's set up each player...");
        for (int j = 1; j < numPlayers + 1; j++) {
            System.out.println("\nEnter name of Player #" + j + ": ");
            player = new CardPlayer(input.next(), j);
            players.add(player);
        }
        if(isDealerCardPlayer) {
            players.add(new CardPlayer("Dealer", players.size()+1));
        }
    }


    public void sortPlayersByScore() {}

    public CardPlayer getGameWinner() {

        return gameWinner;
    }

    public void setGameWinner() {
        sortPlayersByScore();
        gameWinner = players.get(0);
    }

    public void printScoreBoard() {
        sortPlayersByScore();
        System.out.println("\nSCOREBOARD:");
        for(int i = 0; i < players.size(); i++) {
            System.out.println("Player#" + players.get(i).getPlayerNumber() + " -- "
                    + players.get(i).getName() + ": " + players.get(i).getGamesWon());
        }
    }

    public void runGame() {}

    public CardPlayer getHandWinner() {
        return handWinner;
    }

    public void setHandWinner() {}

}
