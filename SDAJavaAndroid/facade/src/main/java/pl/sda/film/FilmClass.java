package pl.sda.film;

import java.util.Date;
import java.util.List;

/**
 * Created by Miki on 25.02.2017.
 */
public class FilmClass {

    private String title;
    private FilmPerson directory;
    private FilmPerson writer;
    private float rating;
    private String genre;
    private String produce;
    private Date release;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public FilmPerson getDirectory() {
        return directory;
    }

    public void setDirectory(FilmPerson directory) {
        this.directory = directory;
    }

    public FilmPerson getWriter() {
        return writer;
    }

    public void setWriter(FilmPerson writer) {
        this.writer = writer;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return "FilmClass{" +
                "title='" + title + '\'' +
                ", directory=" + directory +
                ", writer=" + writer +
                ", rating=" + rating +
                ", genre=" + genre +
                ", produce='" + produce + '\'' +
                ", release=" + release +
                '}';
    }
}
