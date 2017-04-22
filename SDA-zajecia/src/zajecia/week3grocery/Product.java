package zajecia.week3grocery;

/**
 * Created by Miki on 13.02.2017.
 */
public class Product {
    private  String name;
    private  String description;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, String description, double price) {
        this(name);
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrive(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + "\t" + description + "\t"+ price+ "]";
    }
}
