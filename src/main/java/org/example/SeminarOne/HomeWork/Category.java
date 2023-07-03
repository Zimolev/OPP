package org.example.SeminarOne.HomeWork;

import java.util.ArrayList;

public class Category{
    private String name;
    private ArrayList<Goods> productsList;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
        this.productsList = new ArrayList<>();
    }
    void addGoods(Goods goods){
        productsList.add(goods);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Goods> getProductsList() {
        return productsList;
    }

    public void setProductsList(ArrayList<Goods> productsList) {
        this.productsList = productsList;
    }
}

