import Instruments.extended_instruments.Brass.Saxaphone;
import enums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxaphoneTest {

    Saxaphone saxaphone;


    @Before
    public void before() {
        saxaphone = new Saxaphone("Saxaphone", InstrumentType.BRASS, 10,20, "Shiny");
    }

    @Test
    public void canGetParameters () {
        assertEquals("Saxaphone", saxaphone.getName());
        assertEquals(InstrumentType.BRASS, saxaphone.getInstrumentType());
        assertEquals(10, saxaphone.getBuyPrice());
        assertEquals(20, saxaphone.getSellPrice());
        assertEquals("Shiny", saxaphone.getMetal());
    }

    @Test
    public void canPlay() {
        assertEquals("Saxaphone noise", saxaphone.play());
    }

    @Test
    public void canGetProfitMargin() {
        assertEquals(10, saxaphone.calculateMarkup());
    }
}
