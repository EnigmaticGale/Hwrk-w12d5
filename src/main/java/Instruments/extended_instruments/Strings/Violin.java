package Instruments.extended_instruments.Strings;

import Instruments.Instrument;
import Interfaces.InterfacePlay;
import enums.InstrumentType;

public class Violin extends Instrument implements InterfacePlay {

    String hasStrings;


    public Violin(String name, InstrumentType instrumentType, int buyPrice, int sellPrice, String hasStrings) {
        super(name,instrumentType,buyPrice,sellPrice);
        this.hasStrings = hasStrings;
    }

    public String play() {
        return this.getName() + " noise";
    }

    public String doesItHaveStrings() {
        return this.hasStrings;
    }
}