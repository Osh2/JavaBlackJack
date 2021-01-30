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
}
