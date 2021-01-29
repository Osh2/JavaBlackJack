import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
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

    @Test
    public void cardListStartsEmpty() {
        assertEquals(0, deck.getCardsCount());
    }

    @Test
    public void canAddCardToList() {
        Card card = new Card(SuitType.HEARTS, RankType.ACE);
        deck.addCard(card);
        assertEquals(1, deck.getCardsCount());
    }
}
