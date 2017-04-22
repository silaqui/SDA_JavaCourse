package zajecia.week2;

import zajecia.MyMethod;

import java.util.ArrayList;

/**
 * Created by Miki on 11.02.2017.
 */
public class Zajecia9 {
    public static void main(String[] args) {

//        Address adress = new Address ("Poznań","Myśliborska",
//                                    68,"60-432","Poland");
//        User user = new User("Mikołąj", "Woźniak","31.07.1988");
//
//        user.print();

        String message = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam porta ex vitae elit imperdiet semper.";

        Book book = new Book("My Book 1 ", new Author("Mikolaj", "Wozniak"), 2017, message.split(" "));
        Book book2 = new Book("My Book 2 ", new Author("Mikolaj", "Wozniak"), 2018, message.split(" "));
        Book book3 = new Book("My Book 3", new Author("Ktoś", "Inny"), 2019, message.split(" "));
        Book book4 = new Book("My Book 4", new Author("Mikolaj", "Wozniak"), 2019, message.split(" "));

        book.setCategory("Moje");
        book.setDescription("Spoko");

//        book.printInfo();

        BookShelf bookShelf = new BookShelf();

        bookShelf.add(book);
        bookShelf.add(book2);
        bookShelf.add(book3);
        bookShelf.add(book4);

        while (true)
        {
            ArrayList<Book> booksOf = bookShelf.getBooksOf(MyMethod.getString());
            for (Book b : booksOf)
            {
                System.out.println(b);
            }
        }
//        System.out.println();
//        ArrayList<Book> booksFrom = bookShelf.getBooksFrom(2018);
//        for (Book b : booksFrom)
//        {
//            System.out.println(b);
//        }
//        System.out.println();
//        ArrayList<Book> booksSince = bookShelf.getBooksSince(2018);
//        for (Book b : booksSince)
//        {
//            System.out.println(b);
//        }

    }

    public static void printUsers(User[] users) {
        for (int i = 0; i < users.length; i++)
        {
            users[i].print();
        }
    }


}
