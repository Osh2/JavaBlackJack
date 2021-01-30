import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PlayerTest {

    Player player;
    Card card;

    @Before
    public void before(){
        player = new Player("Osh");
        card = new Card(SuitType.DIAMONDS, RankType.FIVE);
    }

    @Test
    public void playerExists(){
        assertNotNull(player);
    }

    @Test
    public void playerHandStartsEmpty() {
        assertEquals(0, player.getHandSize());
    }

    @Test
    public void playerHasName(){
        assertEquals("Osh", player.getName());
    }

    @Test
    public void canAddCardToHand() {
        player.addCard(card);
        assertEquals(1, player.getHandSize());
    }

    @Test
    public void canGetHandCardSuit() {
        player.addCard(card);
        assertEquals(SuitType.DIAMONDS, player.getHandCardSuit());
    }

    @Test
    public void canGetHandCardRankValue() {
        player.addCard(card);
        assertEquals(5, player.getHandCardRankValue());
    }
}
