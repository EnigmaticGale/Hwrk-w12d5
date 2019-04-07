package Shop;

import Interfaces.InterfaceSell;

import java.util.ArrayList;

public class Shop {

    ArrayList<InterfaceSell> stock;


    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<InterfaceSell> getStock() {
        return stock;
    }

    public void addItemToStock(InterfaceSell item) {
        this.stock.add(item);
    }

    public InterfaceSell removeItemFromStock(int index) {
        return this.stock.remove(index);
    }
}
