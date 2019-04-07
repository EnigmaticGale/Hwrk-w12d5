import Instruments.extended_instruments.Brass.Trumpet;
import enums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;


    @Before
    public void before() {
        trumpet = new Trumpet("Trumpet", InstrumentType.BRASS, 10,20, "Valvey");
    }

    @Test
    public void canGetParameters () {
        assertEquals("Trumpet", trumpet.getName());
        assertEquals(InstrumentType.BRASS, trumpet.getInstrumentType());
        assertEquals(10, trumpet.getBuyPrice());
        assertEquals(20, trumpet.getSellPrice());
        assertEquals("Valvey", trumpet.getValves());
    }

    @Test
    public void canPlay() {
        assertEquals("Trumpet noise", trumpet.play());
    }

    @Test
    public void canGetProfitMargin() {
        assertEquals(10, trumpet.calculateMarkup());
    }
}
