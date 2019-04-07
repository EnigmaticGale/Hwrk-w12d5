import Instruments.extended_instruments.Strings.Piano;
import enums.InstrumentType;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;


    @Before
    public void before() {
        piano = new Piano("piano", InstrumentType.STRING, 10,20, "black and white");
    }

    @Test
    public void canGetParameters () {
        assertEquals("piano", piano.getName());
        assertEquals(InstrumentType.STRING, piano.getInstrumentType());
        assertEquals(10, piano.getBuyPrice());
        assertEquals(20, piano.getSellPrice());
        assertEquals("black and white", piano.getKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("piano noise", piano.play());
    }

    @Test
    public void canGetProfitMargin() {
        assertEquals(10, piano.calculateMarkup());
    }
}
