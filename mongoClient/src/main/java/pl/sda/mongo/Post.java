package pl.sda.mongo;

import java.util.Date;

/**
 * Created by Miki on 08.03.2017.
 */
public class Post {

    private String author;
    private String content;
    private Date date;



    public Post() {
    }

    public Post(String author, String content, Date date) {
        this.author = author;
        this.content = content;
        this.date = date;

    }

    public Post(String author, String content) {
        this.author = author;
        this.content = content;
        this.date = new Date();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
