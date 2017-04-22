package pl.sda.servlets.responses;

import org.codehaus.jackson.map.annotate.JsonSerialize;

/**
 * Created by Miki on 04.03.2017.
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CreateUserResponse {
    private String status;
    private String id;
    private String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
