package Instruments.extended_instruments.Synths;

import Instruments.Instrument;
import Interfaces.InterfacePlay;
import enums.InstrumentType;

public class RolandJuno106 extends Instrument implements InterfacePlay {

    String polyphony;


    public RolandJuno106(String name, InstrumentType instrumentType, int buyPrice, int sellPrice, String polyphony) {
        super(name,instrumentType,buyPrice,sellPrice);
        this.polyphony = polyphony;
    }

    public String play() {
        return this.getName() + " noise";
    }

    public String getPolyphony() {
        return this.polyphony;
    }
}
