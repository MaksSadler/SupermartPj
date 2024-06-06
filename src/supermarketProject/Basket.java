package supermarketProject;

import java.util.List;


public class Basket {

    private Products products;
    private List<?> someProducts;

    public List<?> getSomeProducts() {
        return someProducts;
    }

    public double getProducts() {
        return products.getPrice();
    }

    public Basket() {

    }
//    public Basket(Products products) {
//        this.products = products;
//    }
    public Basket(List<?> someProducts) {
        this.someProducts = someProducts;
    }
}
