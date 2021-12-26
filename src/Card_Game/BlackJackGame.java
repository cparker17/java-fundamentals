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

    public BlackJackGame() {
        super();
        setIsDealerCardPlayer(true);
        playersUnder21 = new ArrayList<>();
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

    @Override
    public void setHandWinner() {
        setPlayersUnder21();
        for(int i = 0; i < playersUnder21.size() - 1; i++) {
            if(playersUnder21.size() == 0) {
                System.out.println("No Winner.  Everyone busts!!!");
            }
            else if(playersUnder21.get(i).getHandValue() > playersUnder21.get(i+1).getHandValue()) {
                handWinner = playersUnder21.get(i);
            } else handWinner = playersUnder21.get(i+1);
        }
    }

    public void setHandWinner(CardPlayer player) {
        handWinner = player;
    }

    @Override
    public void sortPlayersByScore() {
        CardPlayer temp;
        for (int i = 0; i < playersUnder21.size(); i++) {
            for (int j = i + 1; j < playersUnder21.size(); j++) {
                if (playersUnder21.get(i).getGamesWon() < playersUnder21.get(j).getGamesWon()) {
                    temp = playersUnder21.get(j);
                    playersUnder21.set(j, playersUnder21.get(i));
                    playersUnder21.set(i, temp);
                }
            }
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
            do {
                players.get(i).printHand();
                System.out.println("Do you want another card?");
                System.out.print("     Press 1 for yes and 2 for no: ");
                menuSelection = input.nextInt();
                if (menuSelection == 1) {
                    getCardDeck().dealCard(players.get(i));
                } else {
                    System.out.println(players.get(i).getName() + " holds.");
                }
                if (players.get(i).isHandOver21()) {
                    players.get(i).printHand();
                    System.out.println(players.get(i).getHandValue() + "...Bust!");
                    players.get(i).setBust(true);
                    menuSelection = -1;
                }
            } while(menuSelection == 1);
        }

        //determine how many players are busted
        int playersBusted = 0;
        for(int i = 0; i < players.size() - 1; i++) {
            if(players.get(i).isHandOver21()) {
                playersBusted++;
            }
        }

        //loop through dealing Dealer a card if at least one player isn't bust
        if(playersBusted != players.size()-1) {
            int dealerIndex = players.size() - 1;
            int dealerHandValue = players.get(dealerIndex).getHandValue();
            if (dealerHandValue >= 16) {
                players.get(dealerIndex).printHand();
                System.out.println("Dealer holds.");
            }
            while (dealerHandValue <= 16) {
                players.get(dealerIndex).printHand();
                getCardDeck().dealCard(players.get(dealerIndex));
                System.out.println("Dealer takes a card.");
                dealerHandValue = players.get(dealerIndex).getHandValue();
            }
            players.get(dealerIndex).printHand();
            if (dealerHandValue > 21) {
                System.out.println("Dealer busts!!!");
                players.get(dealerIndex).setBust(true);
            }
            setHandWinner();
        } else {
            setHandWinner(players.get(players.size()-1));
        }

        getHandWinner().addGameWon();
        setGameWinner();
        for (CardPlayer player : players) {
            player.resetHand();
        }
        getCardDeck().resetDeck();
    }
}
