import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public int getCardsCount() {
        return cards.size();
    }

    public void addCard(Card card) {
        if (!cards.contains(card)) {
            cards.add(card);
        }
    }

    public void populate() {
        Card card;
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values())
                addCard(new Card(suit, rank));
        }
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        return cards.remove(0);

    }
}