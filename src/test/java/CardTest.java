import org.junit.Before;
import org.junit.Test;

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
}
