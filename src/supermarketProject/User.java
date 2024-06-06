package supermarketProject;

public class User implements BuyRefund {
    private String name;
    private String login;
    private String password;
    private Basket basket;
    private double Money;

    public User(String name, double Money, Basket basket) {
        this.name = name;
        this.Money = Money;
        this.basket = basket;
    }

    public Basket getBasket() {
        return basket;
    }

    public double getMoney() {
        return Money;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public void buy(Basket basket) {
        try {
            if (this.Money < basket.getProducts()) {
                System.out.println("Недостаточно средств на балансе, ваш текущий баланс: ");
            } else {
                Money = this.Money - basket.getProducts();
            }
        } catch (NullPointerException e) {
            System.out.println("Ваша корзина пуста.");
        }
    }
}
