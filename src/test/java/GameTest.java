import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Dealer dealer;
    Deck deck;
    Player player1;
    Player player2;


    @Before
    public void before(){
        Player player1 = new Player("Chris");
        Player player2 = new Player("Sarah");
        dealer = new Dealer();
        deck = new Deck();
        game = new Game(dealer, deck);
        game.addPlayer(player1);
        game.addPlayer(player2);
    }

    @Test
    public void gameExists(){
        assertNotNull(game);
    }

    @Test
    public void gameHasPlayers() {
        assertEquals(2, game.getNumPlayers());
    }

    @Test
    public void gameHasDealer() {
        assertEquals(dealer, game.getDealer());
    }

    @Test
    public void gameHasDeck() {
        assertEquals(deck, game.getDeck());
    }

    @Test
    public void gameDeckShouldBeFullAtStartOfGame() {
        game.getDeck().populate();
        assertEquals(52, game.getDeck().getCardsCount());
    }

    @Test
    public void canGetPlayer() {
        Game game = new Game(dealer, deck);
        Player player3 = new Player("Will");
        Player player4 = new Player("Ema");
        game.addPlayer(player3);
        game.addPlayer(player4);
        assertEquals(player3, game.getPlayer(0));
        assertEquals(player4, game.getPlayer(1));
    }
}
