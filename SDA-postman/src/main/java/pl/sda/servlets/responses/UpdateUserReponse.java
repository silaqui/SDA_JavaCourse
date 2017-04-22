package pl.sda.servlets.responses;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by Miki on 04.03.2017.
 */
@JsonSerialize (include = JsonSerialize.Inclusion.NON_NULL)
public class UpdateUserReponse {
    private String status;
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
