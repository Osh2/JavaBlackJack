import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Dealer dealer;
    private Deck deck;


    public Game(Dealer dealer, Deck deck) {
        this.players = new ArrayList<>();
        this.dealer = dealer;
        this.deck = deck;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public int getNumPlayers() {
        return players.size();
    }

    public Dealer getDealer() {
        return dealer;
    }

    public Deck getDeck() {
        return deck;
    }

    public Player getPlayer(int index) {
        return players.get(index);
    }

    public void dealCardToPlayer(int index){
        Card dealtCard = deck.dealCard();
        getPlayer(index).addCard(dealtCard);
    }

    public void dealCardToDealer(){
        Card dealtCard = deck.dealCard();
        dealer.addCard(dealtCard);
    }

    public void startRound1() {
        getDeck().populate();
        for(Player player : players){
            dealCardToPlayer(players.indexOf(player));
        }
        dealCardToDealer();
    }


    //i need it to compare eac player to the the dealer and decide the winner
    //then return the results of every match
    //ie if there are 5 players in the list - there should be 5 winner statements
    public String decideWinner(){
        String winner = "";
        int dealerCard = getDealer().getHandCardRankValue();
        for(Player player : players ){
            int playerCard = player.getHandCardRankValue();
            if(dealerCard > playerCard){
                winner = "Dealer Wins";
            } else {
                winner = String.format("%s Wins!", player.getName());
            }
        }
        return winner;
    }
}
