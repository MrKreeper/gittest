import java.util.Random;
public class Product {
    private double cost;
    private String name;

    public Product(double cost, String name) {
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Продукт(" +
                "название='" + name +
                "\', стоимость=" + cost +
                ')';
    }

    public static Product generateProduct() {
        double[] randCost = {9.99, 0.99, 49.99, 89.99, 79.99, 99.99, 152.99, 299.99};
        String[] randName = {"Twix", "MilkyWays", "Snickers", "Baunty"};
        Random random = new Random();
        Product product = new Product(randCost[random.nextInt(randCost.length)], randName[random.nextInt(randName.length)]);
        return product;
    }
}
