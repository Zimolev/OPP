package org.example.SeminarOne.HomeWork;

import java.util.ArrayList;

public class Category{
    private String categoryName;
    private ArrayList<Goods> productsList;


    public Category(String categoryName) {
        this.categoryName = categoryName;
        this.productsList = new ArrayList<>();
    }
    public String getCategoryName() {
        return categoryName;
    }
    public ArrayList<Goods> getProductsList() {
        return productsList;
    }
    void addGoods(Goods goods){
        productsList.add(goods);
    }


}

