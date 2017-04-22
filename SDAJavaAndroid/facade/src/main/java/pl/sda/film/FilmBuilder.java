package pl.sda.film;

import java.util.Date;

/**
 * Created by Miki on 25.02.2017.
 */
public class FilmBuilder {
    private FilmClass film;

    public FilmBuilder() {
        film = new FilmClass();
    }

    public FilmBuilder withTitle (String title, FilmPerson director){
        film.setTitle(title);
        return this;
    }

    public FilmBuilder withTitle (String title) {
        film.setTitle(title);
        return this;
    }

    public FilmBuilder withDirector (FilmPerson directory) {
        film.setDirectory(directory);
        return this;
    }

    public FilmBuilder withDirectory (FilmPerson writer) {
        film.setWriter(writer);
        return this;
    }

    public FilmBuilder withRaiting (float rating){
        film.setRating(rating);
        return this;
    }

    public FilmBuilder withGenre (String genre)
    {
        film.setGenre(genre);
        return this;
    }

        public FilmBuilder withProduce (String produce)
    {
        film.setGenre(produce);
        return this;
    }
    public FilmBuilder withRelease (Date release){
        film.setRelease(release);
        return this;
    }

    public FilmClass build(){
        return film;
    }

}
