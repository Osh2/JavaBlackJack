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

    public void startRound() {
        getDeck().populate();
        for(Player player : players){
            dealCardToPlayer(players.indexOf(player));
            dealCardToPlayer(players.indexOf(player));
        }
        dealCardToDealer();
        dealCardToDealer();
    }


    public String decideWinner(){
        String winner = "";
        int dealerHand = getDealer().getHandTotal();
        for(Player player : players ){
            int playerHand = player.getHandTotal();
            if(dealerHand > playerHand){
                winner = "Dealer Wins";
            } else {
                winner = String.format("%s Wins!", player.getName());
            }
        }
        return winner;
    }
}
