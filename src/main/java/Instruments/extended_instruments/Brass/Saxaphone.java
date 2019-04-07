package Instruments.extended_instruments.Brass;

import Instruments.Instrument;
import Interfaces.InterfacePlay;
import enums.InstrumentType;

public class Saxaphone extends Instrument implements InterfacePlay {

    String metal;


    public Saxaphone(String name, InstrumentType instrumentType, int buyPrice, int sellPrice, String metal) {
        super(name,instrumentType,buyPrice,sellPrice);
        this.metal = metal;
    }

    public String play() {
        return this.getName() + " noise";
    }

    public String getMetal() {
        return metal;
    }
}
