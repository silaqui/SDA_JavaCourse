package zajecia.week2;

import java.util.ArrayList;

/**
 * Created by Miki on 11.02.2017.
 */
public class BookShelf {
    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book get(int index) {
        if (index >= 0 && index < books.size())
        {
            return books.get(index);
        }
        return null;
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBooksOf(String author) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        author = author.toLowerCase();
        for (Book book : books)
        {
            Author authorOfBook = book.getAuthor();
            String firstNameOfAuthor = authorOfBook.getFirstName().toLowerCase();
            String lastNameOfAuthor = authorOfBook.getLastName().toLowerCase();
            boolean serchRequirment = (
                    firstNameOfAuthor.startsWith(author) ||
                            lastNameOfAuthor.startsWith(author) ||
                            authorOfBook.toString().toLowerCase().startsWith(author) ||
                            (lastNameOfAuthor + " " + firstNameOfAuthor).startsWith(author));
            if (serchRequirment)
            {
                booksTmp.add(book);
            }
        }

        return booksTmp;
    }

    public ArrayList<Book> getBooksFrom(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();

        for (Book book : books)
        {
            if (book.getReleaseDate() >= releaseDate)
            {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksSince(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();

        for (Book book : books)
        {
            if (book.getReleaseDate() == releaseDate)
            {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksLongerThen(int numberOfPage) {
        ArrayList<Book> booksTmp = new ArrayList<>();

        for (Book book : books)
        {
            if (book.getNumberOfPages() > numberOfPage)
            {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
