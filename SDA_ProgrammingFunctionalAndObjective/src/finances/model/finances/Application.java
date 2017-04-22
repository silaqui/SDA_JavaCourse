package finances.model.finances;

import com.sun.org.apache.xpath.internal.SourceTree;
import finances.model.Expence;
import finances.model.Product;

import java.time.LocalDate;
import java.util.*;


/**
 * Created by Miki on 20.02.2017.
 */
public class Application {

    public static void main(String[] args) {

        List<Expence> expences = init();

        System.out.println("Cena jednostkowa mniejsza od 10");
        expences.forEach(expense ->
                expense.getProducts().stream()
                        .filter(product -> product.getUnitPrice() < 10)
                        .forEach(product -> System.out.println(product)));

        System.out.println("Wydatki spozywcze");
        expences.stream()
                .filter(expense -> expense.getType().equals("Spozywcze"))
                .forEach(expense ->
                {
                    expense.getProducts().stream()
                            .filter(product -> product.getUnitPrice() <= 10)
                            .forEach(product -> System.out.println(product));
                });


        // wyswietl tylko banany
        System.out.println("Tylko banany");
        expences.forEach(expence -> expence.getProducts().stream()
                .filter(product -> product.getName().equals("Banan"))
                .forEach(product -> System.out.println(product))
        );

        System.out.print("Koszt za wszystkie banany ");
        double totalBanana =
                expences
                        .stream()
                        .mapToDouble(expence -> expence.getProducts()
                                .stream()
                                .filter(product -> product.getName().equals("Banan"))
                                .mapToDouble(product -> product.getUnitPrice() * product.getAmount())
                                .sum())
                        .sum();
        System.out.println(totalBanana);

        // suma cen wszystkich produktów
        System.out.println("Suma cen produktów");
        double totalPrice = expences.stream().mapToDouble(Expence::getPrice).sum();
        System.out.println("Total price " + totalPrice);


        // kupione przed 19 lutego
        System.out.println("zamowienia kupine przed data");
        expences.stream().filter(expence -> expence.getDate()
                .isBefore(LocalDate.of(2017, 2, 15)))
                .forEach(expence -> System.out.println(expence.toString()));


        //wydatki z konkretnego dnaia
        System.out.println("produkty kupione 02.02");
        expences.stream().filter(expence -> expence
                .getDate().isEqual(LocalDate.of(2017, 2, 2)))
                .forEach(expence -> expence.getProducts()
                        .forEach(product -> System.out.println(product)));

        System.out.println("produkty kupione 02.02 suma cen " + expences.stream()
                .filter(expense -> expense.getDate().isEqual(LocalDate.of(2017, 2, 2)))
                .mapToDouble(expense -> expense.getPrice())
                .sum());


        // suma wydatkow na produkty na litere M

        System.out.println("Suma cen produktów na M " + expences.stream().mapToDouble(expence ->
                expence.getProducts()
                        .stream()
                        .filter(product -> product.getName().startsWith("M"))
                        .mapToDouble(product -> product.getUnitPrice() * product.getAmount())
                        .sum()
        ).sum());

        //wydatki na banany z konkretnego dnia (ilość produktów i wydane pieniądze)
        System.out.println("Suma za banany z 1.03.2017 " + expences.stream()
                .filter(expense -> expense.getDate().isEqual(LocalDate.of(2017, 3, 1)))
                .mapToDouble(expence -> expence.getProducts()
                        .stream()
                        .filter(product -> product.getName().equals("Banan"))
                        .mapToDouble(product -> product.getUnitPrice() * product.getAmount()).sum()
                ).sum());


        System.out.println("koszt produktow kupionych w parzystych ilosciach " +
                expences.stream().mapToDouble(
                        expence -> expence.getProducts()
                                .stream()
                                .filter(product -> product.getAmount() % 2 == 0)
                                .mapToDouble(product -> product.getAmount() * product.getUnitPrice()).sum()
                ).sum()
        );

        // z kazdego expensa produkt z ktorego zaplacilismy najwiecej
        expences.stream().map(expence ->
                expence.getProducts()
                        .stream()
                        .max((e1, e2) -> (e1.getUnitPrice() * e1.getAmount()) >
                                (e2.getUnitPrice() * e2.getAmount()) ? 1 : -1)
                        .get())
                .forEach(System.out::println);

        //najdrozszy produkt ze wsyzstkich expensow
        System.out.println("Najdrozszy " + expences.stream().map(expence ->
                expence.getProducts()
                        .stream()
                        .max((e1, e2) -> (e1.getUnitPrice() * e1.getAmount()) >
                                (e2.getUnitPrice() * e2.getAmount()) ? 1 : -1)
                        .get())
                .max((e1, e2) -> (e1.getUnitPrice() * e1.getAmount()) >
                        (e2.getUnitPrice() * e2.getAmount()) ? 1 : -1)
                .get());

    }

    private static List<Expence> init() {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Banan", 15, 2));
        products.add(new Product("Gruszka", 10, 4));
        products.add(new Product("Piertuszka", 12, 12));
        products.add(new Product("Masło", 1, 43));

        Expence expence = new Expence("Spozywcze", products, 2017, 2, 2);

        List<Product> products2 = new ArrayList<>();

        products2.add(new Product("Farba", 5, 100));
        products2.add(new Product("Gwoździe", 100, 4));
        products2.add(new Product("Młotek", 1, 250));

        Expence expence2 = new Expence("Budowlane", products2, 2017, 2, 1);

        List<Product> products3 = new ArrayList<>();

        products3.add(new Product("Banan", 5, 20));
        products3.add(new Product("Wit C", 10, 45));
        products3.add(new Product("Żel", 2, 62));
        products3.add(new Product("Maść", 1, 13));

        Expence expence3 = new Expence("Leki", products3, 2017, 3, 1);

        List<Product> products4 = new ArrayList<>();

        products4.add(new Product("Mieso", 20, 8));
        products4.add(new Product("Szynka", 10, 12));
        products4.add(new Product("Cos tam", 15, 25));
        products4.add(new Product("Banan", 10, 15));

        Expence expence4 = new Expence("Spozywcze", products4, 2017, 3, 1);


        return Arrays.asList(expence, expence2, expence3, expence4);
    }
}

