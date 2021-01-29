import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.CLUBS, RankType.THREE);
    }

    @Test
    public void cardExists(){
        assertNotNull(card);
    }


    @Test
    public void canGetSuit() {
        assertEquals(SuitType.CLUBS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.THREE, card.getRank());
    }
}
