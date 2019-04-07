package Instruments.extended_instruments.Strings;

import Instruments.Instrument;
import Interfaces.InterfacePlay;
import enums.InstrumentType;

public class Piano extends Instrument implements InterfacePlay {

    String keys;


    public Piano(String name, InstrumentType instrumentType, int buyPrice, int sellPrice, String keys) {
        super(name,instrumentType,buyPrice,sellPrice);
        this.keys = keys;
    }

    public String play() {
        return this.getName() + " noise";
    }

    public String getKeys() {
        return this.keys;
    }
}