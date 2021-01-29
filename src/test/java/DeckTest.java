import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class DeckTest {

    public Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckExists() {
    assertNotNull(deck);
    }


}
