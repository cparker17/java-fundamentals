package Card_Game;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BlackJackGame extends CardGame implements Gambler {
    private Scanner input = new Scanner(System.in);
    private boolean isGambling;
    private int initialPotValue;
    private int potValue;
    private int currentBet;
    private ArrayList<CardPlayer> playersUnder21;
    private CardPlayer handWinner;

    public BlackJackGame() {
        super();
        setIsDealerCardPlayer(true);
    }

    @Override
    public void setPlayers() {
        super.setPlayers();
        if (isDealerCardPlayer()) {
            players.add(new CardPlayer("Dealer"));
        }
    }
    public boolean getIsGambling() {
        return isGambling;
    }

    public void setIsGambling() {
        int i = 0;
        do {
            System.out.println("Will you be gambling or just keeping score?");
            System.out.println("   1 - Gambling\n   2 - Just Keeping Score\n   3 - Quit");
            System.out.println("Enter Selection: ");
            try {
                switch (input.nextInt()) {
                    case 1:
                        System.out.println("Let's place some bets!");
                        isGambling = true;
                        System.out.println("Please enter your buy in amount: $");
                        initialPotValue = input.nextInt();
                        break;
                    case 2:
                        System.out.println("No betting.  Let's keep score.");
                        isGambling = false;
                        break;
                    case 3:
                        System.exit(1);
                    default:
                        i = -1;
                        throw new MenuSelectionOutOfBoundsException();
                }
            } catch (MenuSelectionOutOfBoundsException | InputMismatchException exc) {
                System.out.println(exc.toString());
            }
        } while(i == -1);
    }

    @Override
    public int getInitialPotValue() {
        return initialPotValue;
    }

    @Override
    public void setInitialPotValue(int initialPotValue) {
        this.initialPotValue = initialPotValue;
    }

    @Override
    public int getPotValue() {
        return potValue;
    }

    @Override
    public String askForBet() {
        return "How much would you like to bet?";
    }

    @Override
    public void setCurrentBet(int bet) {
        currentBet = bet;
    }

    public ArrayList<CardPlayer> getPlayersUnder21() {
        return playersUnder21;
    }

    public void setPlayersUnder21() {
        for(CardPlayer player : players) {
            if(!player.isHandOver21()) {
                playersUnder21.add(player);
            }
        }
    }

    public CardPlayer getHandWinner() {
        return handWinner;
    }

    public void setHandWinner() {
        setPlayersUnder21();
        for(int i = 0; i < playersUnder21.size()-1; i++) {
            if(playersUnder21.get(i+1).getHandValue() > playersUnder21.get(i).getHandValue()) {
                handWinner = playersUnder21.get(i+1);
            } else handWinner = playersUnder21.get(i);
        }
    }

    public void runGame() {
        //deal 2 cards to each player to start the game
        for(CardPlayer player : players) {
            getCardDeck().dealCard(player);
            getCardDeck().dealCard(player);
        }

        //loop through each player except dealer to see if they want more cards
        for(int i = 0; i < players.size()-1; i++) {
            int menuSelection = 0;
            int playerNumber = 1;
            do {
                System.out.println("Player #" + playerNumber + ":");
                System.out.println(players.get(i).getName() + "'s hand includes:");
                players.get(i).printHand();
                System.out.println("Score: " + players.get(i).getHandValue());
                System.out.println("Do you want another card?");
                System.out.print("     Press 1 for yes and 2 for no: ");
                menuSelection = input.nextInt();
                if (menuSelection == 1) {
                    getCardDeck().dealCard(players.get(i));
                } else {
                    System.out.println(players.get(i).getName() + " holds.");
                }
                if (players.get(i).isHandOver21()) {
                    System.out.println(players.get(i).getHandValue() + "...Bust!");
                    menuSelection = -1;
                }
                playerNumber++;
            } while(menuSelection == 1);
        }

        //loop through dealing Dealer a card if hand value is 16 or less
        int dealerIndex = players.size() -1;
        int dealerHandValue = players.get(dealerIndex).getHandValue();
        if(dealerHandValue >= 16) {
            System.out.println("Dealer's hand includes:");
            System.out.println("Dealer's Score = " + dealerHandValue);
            System.out.println("Dealer holds.");
        }
        while (dealerHandValue <= 16) {
            System.out.println("Dealer's hand includes:");
            players.get(dealerIndex).printHand();
            System.out.println("Dealer's Score: " + dealerHandValue);
            getCardDeck().dealCard(players.get(dealerIndex));
            dealerHandValue = players.get(dealerIndex).getHandValue();
        }
        if(dealerHandValue > 21) {
            System.out.println("Dealer busts!!!");
        }
        setHandWinner();
        setGameWinner();
    }
}
