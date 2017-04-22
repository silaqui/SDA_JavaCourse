package zajecia.week2;

/**
 * Created by Miki on 11.02.2017.
 */
public class Book {
    private String title;
    private Author author;
    private int numberOfPages;
    private int releaseDate;
    private String description;
    private String[] content;
    private String category;


    public Book(String title, Author author, int releaseDate, String[] content) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.content = content;
        this.numberOfPages = content.length;
    }

    public Book(String title, Author author, int releaseDate, String[] content, String description, String category) {
        this(title, author, releaseDate, content);
        this.description = description;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public String[] getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void printInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("Title: ").append(title)
                .append("\nAuthor: ").append(author)
                .append("\nRelease Date: ").append(releaseDate);
        String toPrint = stringBuilder.toString();
        System.out.println(toPrint);
    }

    public String getPage(int index) {
        int actualIndex = index -1;
        return (actualIndex >= 0 && actualIndex < this.numberOfPages) ? content[actualIndex] : "Page don't exists";
    }

    public void loremIpsum(int size) {
        for (int i = 0; i < size; i++)
        {
            this.content[i] = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam porta ex vitae elit imperdiet semper. Aenean faucibus malesuada odio, id facilisis nibh tristique vitae. Quisque vestibulum mauris a nisl laoreet viverra. Maecenas malesuada id urna non maximus. Aliquam consequat nulla felis, a sagittis velit posuere eget. In nisi ipsum, feugiat sed rhoncus id, iaculis ut libero. Quisque at augue mauris. Praesent at nunc efficitur, vestibulum massa ac, tempus nulla.";
        }

    }

    @Override
    public String toString() {
        return "Book: " + title  +
                " \t Author: " + author +
                "\tPages:" + numberOfPages +
                "\tRelease Date:" + releaseDate
//                ", description='" + description + '\'' +
//                ", content=" + Arrays.toString(content) +
//                ", category='" + category + '\'' +
//                '}'
                ;
    }
}
