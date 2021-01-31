import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DealerTest {

    Dealer dealer;
    Card card;

    @Before
    public void before(){
        dealer = new Dealer();
        card = new Card(SuitType.DIAMONDS, RankType.FIVE);
    }

    @Test
    public void playerExists(){
        assertNotNull(dealer);
    }

    @Test
    public void playerHandStartsEmpty() {
        assertEquals(0, dealer.getHandSize());
    }

    @Test
    public void canAddCardToHand() {
        dealer.addCard(card);
        assertEquals(1, dealer.getHandSize());
    }

    @Test
    public void canGetHandCardSuit() {
        dealer.addCard(card);
        assertEquals(SuitType.DIAMONDS, dealer.getHandCardSuit());
    }

    @Test
    public void canGetHandCardRankValue() {
        dealer.addCard(card);
        assertEquals(5, dealer.getHandCardRankValue());
    }

    @Test
    public void canGetHandTotal() {
        dealer.addCard(card);
        Card card2 = new Card(SuitType.SPADES, RankType.ACE);
        dealer.addCard(card2);
        assertEquals(6, dealer.getHandTotal());
    }

}
