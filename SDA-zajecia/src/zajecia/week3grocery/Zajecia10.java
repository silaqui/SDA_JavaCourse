package zajecia.week3grocery;
import zajecia.week2.Address;

import java.util.HashMap;

/**
 * Created by Miki on 13.02.2017.
 */
public class Zajecia10 {

    public static void main(String[] args) {

        Address universalAddress = new Address ("Poznań","Myśliborska",68,"60-432","Poland");

        Product product1 = new Product("Pietruszka", "Zielona", 100);
        Product product2 = new Product("Gruszka", "Zielona", 95);
        Product product3 = new Product("Sałata ", "Zielona", 120);

        Client client1 = new Client("Mikołaj" , "Woźniak", "00 45 22", universalAddress);
        Client client2 = new Client("Michał " , "Woźniak", "22 11 22", universalAddress);

//        HashMap<Product,Integer> products = new HashMap<>();
//        products.put(product1, 2);
//        products.put(product2, 5);
//        products.put(product3, 12);
//        Order order1 = new Order(client1,products);
//        System.out.println("Total price: " + order1.getPrice());

//        HashMap<Product,Integer> products = new HashMap<>();
//        products.put(product1,100);
//        products.put(product2,300);
//        products.put(product3,400);
//        Warehouse warehouse = new Warehouse(products);
//
//        HashMap<Product,Integer> productIntegerHashMap = warehouse.get(product1,80);


    }

    public static void mapDemo (){
        HashMap<String,Client> map = new HashMap<>();
        map.put("123",new Client ("M","W"));
        map.put("345", new Client("Q","K"));
        Client client = map.get("123");
        map.forEach((k, v)-> {
            System.out.println(k);
            System.out.println(v);
            System.out.println();
        });
    }
}
