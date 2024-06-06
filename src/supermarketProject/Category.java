package supermarketProject;


import java.util.List;

public class Category {

    String name;

    public Category(String name,List<?> someProducts) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
