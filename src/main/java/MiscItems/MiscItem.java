package MiscItems;

import Interfaces.InterfaceSell;

public class MiscItem implements InterfaceSell {

    String description;
    int buyPrice;
    int sellPrice;



    public MiscItem(String description, int buyPrice, int sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public String getDescription() {
        return description;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }


    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }

}
