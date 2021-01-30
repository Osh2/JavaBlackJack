import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Dealer dealer;
    Player player;
    Deck deck;

    @Before
    public void before(){
        Player player1 = new Player("Chris");
        Player player2 = new Player("Sarah");
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
        assertEquals(2, game.getPlayers());
    }
}
