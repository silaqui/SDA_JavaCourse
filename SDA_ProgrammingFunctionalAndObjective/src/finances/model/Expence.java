package finances.model;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by Miki on 20.02.2017.
 */
public class Expence {

    private String type;
    private List<Product> products;
    private LocalDate date;
    private double price;

    public String getType() {
        return type;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getPrice() {
        return price;
    }

    public Expence(String type, List<Product> products, int year, int month, int dayOfMomth) {
        this.type = type;
        this.products = products;
        this.date = LocalDate.of(year, month, dayOfMomth);
        this.price = countPrice();

    }

    public Expence(String type, List<Product> products) {
        this.type = type;
        this.products = products;
        this.date = LocalDate.now();
        this.price = countPrice();

    }

    private double countPrice() {
        double tmpPrice = 0;
        for (Product product : products)
        {
            tmpPrice += product.getAmount() * product.getUnitPrice();
        }
        return tmpPrice;
    }

    @Override
    public String toString() {
        return "Expence{" +
                "type='" + type + '\'' +
                ", products=" + products +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}








