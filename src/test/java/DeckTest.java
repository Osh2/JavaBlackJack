import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest {

    public Deck deck;
    public Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.ACE);
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
        deck.addCard(card);
        assertEquals(1, deck.getCardsCount());
    }

    @Test
    public void cantAddSameCardTwice() {
        deck.addCard(card);
        deck.addCard(card);
        assertEquals(1, deck.getCardsCount());
    }

    @Test
    public void canPopulateCards(){
        deck.populate();
        assertEquals(52, deck.getCardsCount());
    }

    @Test
    public void canDealCard() {
        deck.populate();
        deck.dealCard();
        assertEquals(51, deck.getCardsCount());
        deck.dealCard();
        assertEquals(50, deck.getCardsCount());
        deck.dealCard();
        assertEquals(49, deck.getCardsCount());
    }
}
