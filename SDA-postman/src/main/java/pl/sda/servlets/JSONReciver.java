package pl.sda.servlets;

import org.codehaus.jackson.map.ObjectMapper;
import pl.sda.entities.User;
import pl.sda.services.UserService;
import pl.sda.servlets.responses.CreateUserResponse;
import pl.sda.servlets.responses.UpdateUserReponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public class JSONReciver extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BufferedReader reader = req.getReader();

        StringBuffer json = new StringBuffer();

        String line = null;

        while ((line = reader.readLine()) != null) {
            json.append(line);
        }

        UserService userService = new UserService();
        CreateUserResponse response = userService.addUser(json.toString());

        ObjectMapper mapper = new ObjectMapper();
        resp.getWriter().write(mapper.writeValueAsString(response));
        resp.setContentType("application/json");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {

        String id = req.getParameter("id");

        UserService userService = new UserService();
        User userById = userService.getUserById(id);

        ObjectMapper mapper = new ObjectMapper();

        try {
            resp.getWriter().write(mapper.writeValueAsString(userById));
        } catch (IOException e) {
            e.printStackTrace();
        }
        resp.setContentType("application/json");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String deleteId = req.getParameter("deleteId");

        UserService userService = new UserService();
        resp.getWriter().write(userService.deleteUserById(deleteId));
        resp.setContentType("application/json");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BufferedReader reader = req.getReader();

        StringBuffer json = new StringBuffer();

        String line = null;

        while ((line = reader.readLine()) != null) {
            json.append(line);
        }

        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(json.toString(), User.class);

        UserService userService = new UserService();
        UpdateUserReponse response = UserService.updateUser(user);

        resp.getWriter().write((mapper.writeValueAsString(response)));

    }
}
