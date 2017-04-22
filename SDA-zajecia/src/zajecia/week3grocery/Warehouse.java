package zajecia.week3grocery;

import java.util.HashMap;

/**
 * Created by Miki on 13.02.2017.
 */
public class Warehouse {
    private HashMap<Product, Integer> warehouse;

    public Warehouse(HashMap<Product, Integer> warehouse) {
        this.warehouse = warehouse;
    }

    public boolean hasAmount(Product product, Integer amount) {

        boolean flag = false;
        if (warehouse.containsKey(product.getName()))
        {
            Integer amountInWarehouse = warehouse.get(product);
            flag = (amountInWarehouse >= amount);
        }
        return flag;
    }

    public HashMap<Product, Integer> get(Product product, int amount) {
        if (!hasAmount(product, amount))
        {
            System.out.println("Brak towaru");
            return new HashMap<>();
        }

        Integer amountInWarehouse = warehouse.get(product);
        warehouse.put(product, amountInWarehouse - amount);

        HashMap<Product, Integer> products = new HashMap<>();
        products.put(product, amount);
        return products;

    }

    public void add(Product product, int amount) {
        if (warehouse.containsKey(product))
        {
            Integer amountInWarehouse = warehouse.get(product);
            warehouse.put(product, amountInWarehouse + amount);
        } else
        {
            warehouse.put(product, amount);
        }
    }

}

