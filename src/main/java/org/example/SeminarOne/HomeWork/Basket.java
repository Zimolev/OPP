package org.example.SeminarOne.HomeWork;

import java.util.ArrayList;


public class Basket{
   private ArrayList<Goods> purchasedGoods;

    public Basket() {
        this.purchasedGoods =  new ArrayList<>();
    }
    public ArrayList<Goods> getPurchasedGoods() {
        return purchasedGoods;
    }
    void addBasket(Goods goods){
        purchasedGoods.add(goods);
    }
    void removeBasket(Goods goods){
        purchasedGoods.remove(goods);
    }
}
