package application.model;

/**
 * Created by Miki on 15.03.2017.
 */
public enum StreetPrefix {

    STREET("ul."), AVENUE("al."), SQUARE("pl.");

    private String prefix;

    StreetPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix ()
    {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }


}