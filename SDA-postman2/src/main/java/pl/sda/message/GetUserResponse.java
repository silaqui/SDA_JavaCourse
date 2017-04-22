package pl.sda.message;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by Miki on 06.03.2017.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class GetUserResponse {
    private String name;
    private String login;
    private String mail;
    private String ID;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
