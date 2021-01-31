import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GameTest {

    Game game;
    Dealer dealer;
    Deck deck;

    @Before
    public void before(){
        Player player1 = new Player("Chris");
        dealer = new Dealer();
        deck = new Deck();
        game = new Game(dealer, deck);
        game.addPlayer(player1);
    }

    @Test
    public void gameExists(){
        assertNotNull(game);
    }

    @Test
    public void gameHasPlayers() {
        assertEquals(1, game.getNumPlayers());
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

    @Test
    public void canDealCardToPlayer() {
        game.getDeck().populate();
        assertEquals(0, game.getPlayer(0).getHandSize());
        game.dealCardToPlayer(0);
        assertEquals(1, game.getPlayer(0).getHandSize());
    }

    @Test
    public void canDealCardToDealer() {
        game.getDeck().populate();
        assertEquals(0, game.getDealer().getHandSize());
        game.dealCardToDealer();
        assertEquals(1, game.getDealer().getHandSize());
    }

    @Test
    public void playerAndDealerHave2CardsEach() {
        assertEquals(0, game.getPlayer(0).getHandSize());
        assertEquals(0, game.getDealer().getHandSize());
        game.startRound();
        assertEquals(2, game.getPlayer(0).getHandSize());
        assertEquals(2, game.getDealer().getHandSize());
        assertEquals(48, game.getDeck().getCardsCount());
    }

    //currently the decideWinner method only returns the first
    @Test
    public void shouldDecideWinner() {
        Game game2 = new Game(dealer, deck);
        game2.addPlayer(new Player("Justin"));
        game2.startRound();
        String winner =  game2.decideWinner();
        assertNotEquals("", winner);
        System.out.println(winner);
        System.out.println(game2.getDealer().getHandTotal());
        System.out.println(game2.getPlayer(0).getHandTotal());

    }
}
