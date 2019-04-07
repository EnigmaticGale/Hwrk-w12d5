import Instruments.extended_instruments.Synths.RolandJuno106;
import enums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RolandJuno106Test {

    RolandJuno106 rolandJuno106;


    @Before
    public void before() {
        rolandJuno106 = new RolandJuno106("rolandJuno106", InstrumentType.SYNTH, 10,20, "6 voices");
    }

    @Test
    public void canGetParameters () {
        assertEquals("rolandJuno106", rolandJuno106.getName());
        assertEquals(InstrumentType.SYNTH, rolandJuno106.getInstrumentType());
        assertEquals(10, rolandJuno106.getBuyPrice());
        assertEquals(20, rolandJuno106.getSellPrice());
        assertEquals("6 voices", rolandJuno106.getPolyphony());
    }

    @Test
    public void canPlay() {
        assertEquals("rolandJuno106 noise", rolandJuno106.play());
    }

    @Test
    public void canGetProfitMargin() {
        assertEquals(10, rolandJuno106.calculateMarkup());
    }
}

