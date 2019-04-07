package Instruments;

import Interfaces.InterfacePlay;
import Interfaces.InterfaceSell;
import enums.InstrumentType;

abstract public class Instrument implements InterfaceSell {


    String name;
    InstrumentType instrumentType;
    int buyPrice;



    int sellPrice;

    public Instrument(String name, InstrumentType instrumentType, int buyPrice, int sellPrice) {
        this.name = name;
        this.instrumentType = instrumentType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }


    public int calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }

}
