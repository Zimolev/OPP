package org.example.SeminarOne.HomeWork;

import java.util.ArrayList;


public class Basket extends User{
    private ArrayList<Goods> purchasedGoods;

    public Basket(ArrayList<Goods> purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }

    public Basket() {
    }

    public ArrayList<Goods> getPurchasedGoods() {
        return purchasedGoods;
    }
    public void setPurchasedGoods(ArrayList<Goods> purchasedGoods) {
        this.purchasedGoods = purchasedGoods;
    }
    void addBasket(Goods goods){
        purchasedGoods.add(goods);
    }
    void removeBasket(Goods goods){
        purchasedGoods.remove(goods);
    }
}
