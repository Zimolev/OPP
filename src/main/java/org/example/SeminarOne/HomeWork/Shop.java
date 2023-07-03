package org.example.SeminarOne.HomeWork;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Category> categories;
    public Shop() {
        this.categories = new ArrayList<>();
    }
    public void addCategory(Category category) {
        categories.add(category);
    }
    public void printCatalog() {
        for (Category category : categories) {
            System.out.println(category.getName());
            ArrayList<Goods> products = category.getProductsList();
            for (Goods goods : products) {
                System.out.println("'" + goods.getName() + "'");
            }
        }
    }
}
