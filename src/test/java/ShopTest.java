import Instruments.extended_instruments.Synths.YamahaDX7;
import MiscItems.MiscItem;
import Shop.Shop;
import enums.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ShopTest {

    Shop shop;
    YamahaDX7 yamahaDX7;
    MiscItem junk;

    @Before
    public void before() {
        shop = new Shop();
        yamahaDX7 = new YamahaDX7("YamahaDX7", InstrumentType.SYNTH, 10, 20 , "supermax");
        junk = new MiscItem("its junk", 10, 20);
    }


    @Test
    public void arrayStartsEmptyAndCanGet() {
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canAddDifferentItems(){
        shop.addItemToStock(yamahaDX7);
        shop.addItemToStock(junk);
        assertEquals(2,shop.getStock().size());
    }

    @Test
    public void canRemoveItem() {
        shop.addItemToStock(yamahaDX7);
        assertEquals(1,shop.getStock().size());
        shop.removeItemFromStock(0);
        assertEquals(0,shop.getStock().size());
    }

}
