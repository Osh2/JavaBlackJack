import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name) {
        this.hand = new ArrayList<>();
        this.name = name;
    }
}
