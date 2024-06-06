package supermarketProject;


import java.util.ArrayList;
import java.util.List;

public class Supermarket {

    private Supermarket() {

        User user = new User("Bob", 4000, new Basket());

        Drinks vodka = new Drinks("Vodka", 500, 4.3);
        Drinks pepsi = new Drinks("Pepsi", 120, 3.3);
        Drinks cola = new Drinks("Cola", 110, 2.3);

        Food chicken = new Food("Chicken", 240, 4.3);
        Food cheese = new Food("Cheese", 350, 4.3);
        Food meat = new Food("Meat", 650, 5.0);
        List<Food> foods = new ArrayList<>();
        foods.add(chicken);
        foods.add(cheese);
        foods.add(meat);
        Category category = new Category("Напитки", List.of(vodka, cola, pepsi));
        Category category2 = new Category("Еда", foods);


        //user.buy(new Basket(vodka));
        user.buy(new Basket(foods));
        System.out.println(user.getMoney());
    }

    public static void run() {
        new Supermarket();
    }
}
