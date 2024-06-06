package supermarketProject;

public abstract class Products {

    private final String name;
    private final double price;
    private final double rating;

    public Products(String name, int price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }
}
