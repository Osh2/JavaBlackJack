import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> hand;

    public Dealer() {
        this.hand = new ArrayList<>();
    }

    public int getHandSize() {
        return hand.size();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public SuitType getHandCardSuit() {
        return hand.get(0).getSuit();
    }

    public int getHandCardRankValue() {
        return hand.get(0).getRankValue();
    }

    public int getHandTotal(){
        int total = 0;
        for(Card card : hand){
            total += card.getRankValue();
        }
        return total;
    }
}
