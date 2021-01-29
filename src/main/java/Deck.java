import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards;

    public Deck(){
        this.cards = new ArrayList<>();
    }

    public int getCardsCount() {
        return cards.size();
    }

    public void addCard(Card card) {
        cards.add(card);
    }
}
