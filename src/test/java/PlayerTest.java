import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Osh");
    }

    @Test
    public void playerExists(){
        assertNotNull(player);
    }
}
