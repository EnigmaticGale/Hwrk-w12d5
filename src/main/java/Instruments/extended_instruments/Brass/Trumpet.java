package Instruments.extended_instruments.Brass;

import Instruments.Instrument;
import Interfaces.InterfacePlay;
import enums.InstrumentType;

public class Trumpet extends Instrument implements InterfacePlay {

    String valves;


    public Trumpet(String name, InstrumentType instrumentType, int buyPrice, int sellPrice, String valves) {
        super(name,instrumentType,buyPrice,sellPrice);
        this.valves = valves;
    }

    public String play() {
        return this.getName() + " noise";
    }

    public String getValves() {
        return valves;
    }
}
