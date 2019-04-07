package Instruments.extended_instruments.Synths;

import Instruments.Instrument;
import Interfaces.InterfacePlay;
import enums.InstrumentType;

public class YamahaDX7 extends Instrument implements InterfacePlay {

    String syex;


    public YamahaDX7(String name, InstrumentType instrumentType, int buyPrice, int sellPrice, String syex) {
        super(name,instrumentType,buyPrice,sellPrice);
        this.syex = syex;
    }

    public String play() {
        return this.getName() + " noise";
    }

    public String getSYEX() {
        return this.syex;
    }
}
