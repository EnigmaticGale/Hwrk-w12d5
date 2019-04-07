import Instruments.extended_instruments.Synths.YamahaDX7;
import enums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class YamahaDX7Test {

    YamahaDX7 yamahaDX7;


    @Before
    public void before() {
        yamahaDX7 = new YamahaDX7("yamahaDX7", InstrumentType.SYNTH, 10,20, "supermax");
    }

    @Test
    public void canGetParameters () {
        assertEquals("yamahaDX7", yamahaDX7.getName());
        assertEquals(InstrumentType.SYNTH, yamahaDX7.getInstrumentType());
        assertEquals(10, yamahaDX7.getBuyPrice());
        assertEquals(20, yamahaDX7.getSellPrice());
        assertEquals("supermax", yamahaDX7.getSYEX());
    }

    @Test
    public void canPlay() {
        assertEquals("yamahaDX7 noise", yamahaDX7.play());
    }

    @Test
    public void canGetProfitMargin() {
        assertEquals(10, yamahaDX7.calculateMarkup());
    }
}
