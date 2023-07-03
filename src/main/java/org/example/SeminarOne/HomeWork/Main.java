package org.example.SeminarOne.HomeWork;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Category category1 = new Category("products");
        Goods goods1 = new Goods("Sugar", 70.0, 5);
        Goods goods2 = new Goods("Sol", 15.0, 4);
        category1.addGoods(goods1);
        category1.addGoods(goods2);
        Category category2 = new Category("alcohol");
        category2.addGoods(new Goods("Beer", 170.0, 10));
        category2.addGoods(new Goods("Whiskey", 1500.0, 2));
        Category category3 = new Category("grocery");
        category3.addGoods(new Goods("Spaghetti", 90.0, 10));
        category3.addGoods(new Goods("Rice", 120.0, 9));
        shop.addCategory(category1);
        shop.addCategory(category2);
        shop.addCategory(category3);

        shop.printCatalog();

        User user1 = new User("user1", "qwe");
        System.out.println("goods1 = " + goods1);
        user1.getBasket().addBasket(goods1);
        user1.getBasket().removeBasket(goods1);
        shop.printCatalog();


    }

}

