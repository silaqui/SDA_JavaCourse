package finances.model;

/**
 * Created by Miki on 20.02.2017.
 */
public class Product {

    private String name;
    private int amount;
    private double unitPrice;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Product(String name, int amount, double unitPrice) {
        this.name = name;
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                name  +
                ", amount=" + amount +
                ", Price=" + unitPrice +
                '}';
    }
}
