import MiscItems.MiscItem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MistItemTest {

    MiscItem miscItem;

    @Before
    public void before () {
        miscItem = new MiscItem("Strings",10, 20);
    }

    @Test
    public void canGetParameters() {
        assertEquals("Strings", miscItem.getDescription());
        assertEquals(10, miscItem.getBuyPrice());
        assertEquals(20,miscItem.getSellPrice());
    }

    @Test
    public void canSetPrice() {
        miscItem.setSellPrice(15);
        assertEquals(15,miscItem.getSellPrice());
    }
}
