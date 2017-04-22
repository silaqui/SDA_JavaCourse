package pl.sda.film;

/**
 * Created by Miki on 25.02.2017.
 */
public class Main {

    public static void main(String[] args) {

        FilmBuilder filmBuilder = new FilmBuilder();
        FilmPerson director = new FilmPerson("Mikolaj", "Wozniak");

        FilmClass film = filmBuilder.withTitle("Kłos").withDirector(director).build();

        System.out.println(film.toString());


    }

}
