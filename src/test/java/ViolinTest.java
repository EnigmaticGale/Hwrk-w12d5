import Instruments.extended_instruments.Strings.Violin;
import enums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ViolinTest {

    Violin violin;


    @Before
    public void before() {
        violin = new Violin("violin", InstrumentType.STRING, 10,20, "yes");
    }

    @Test
    public void canGetParameters () {
        assertEquals("violin", violin.getName());
        assertEquals(InstrumentType.STRING, violin.getInstrumentType());
        assertEquals(10, violin.getBuyPrice());
        assertEquals(20, violin.getSellPrice());
        assertEquals("yes", violin.doesItHaveStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("violin noise", violin.play());
    }

    @Test
    public void canGetProfitMargin() {
        assertEquals(10, violin.calculateMarkup());
    }
}