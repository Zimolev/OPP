package org.example.SeminarOne.HomeWork;
import java.util.ArrayList;
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

        User customer1 = new User("Nick", "pass123");
        User customer2 = new User("Wendy", "pass321");


        customer1.getBasket().addBasket(category1.getProductsList().get(0));
        customer2.getBasket().addBasket(category2.getProductsList().get(1));

        customer1.getBasket().removeBasket(category1.getProductsList().get(0));
        customer1.getBasket().addBasket(category3.getProductsList().get(0));
        category2.getProductsList().remove(1);
        category3.getProductsList().remove(0);


        System.out.println(customer1.getLogin() + " - purchases: ");
        var customer1Purchases = customer1.getBasket().getPurchasedGoods();
        System.out.println("customer1Purchases = " + customer1Purchases);
        for (Goods customer1Purchase : customer1Purchases) {
            System.out.println("* ");
        }

        System.out.println(customer2.getLogin() + " - purchases: ");
        ArrayList<Goods> customer2Purchases = customer2.getBasket().getPurchasedGoods();
        for (Goods goods : customer2Purchases) {
            System.out.println("* " + goods.getName() + " cost " + goods.getPrice() + " product rating is "
                    + goods.getRank());
        }

        System.out.println("________________________________________");
        System.out.println("Stores assortment after customers visit: ");
        shop.printCatalog();
    }

}

