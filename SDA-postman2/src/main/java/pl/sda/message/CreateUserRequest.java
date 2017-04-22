package pl.sda.message;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by Miki on 06.03.2017.
 */
@JsonSerialize
public class CreateUserRequest {
    private String name;
    private String login;
    private String mail;

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

}
