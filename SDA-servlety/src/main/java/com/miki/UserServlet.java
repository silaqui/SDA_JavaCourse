package com.miki;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Miki on 01.03.2017.
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = Arrays.asList(
                new User("Mikolaj", "Wozniak"),
                new User("Michał", "Wozniak"),
                new User("Marysia", "Wozniak"),
                new User("Martyna", "Wozniak"));

        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();


//        writeUsers(userList, writer);

//        writeUsersWithCounter(req, userList, writer);

        String requestURI = req.getRequestURI();
        Integer index = new Integer (requestURI.substring(requestURI.lastIndexOf("/") + 1));
        User user = userList.get(index);
        writer.write("<li>" + user.getFirstName() + "</li>");

//        userList.stream()
//                .filter(e -> e.getFirstName()
//                        .startsWith(req.getParameter("starts")))
//                .forEach(e1 -> writer
//                        .write("<li>" + e1.getFirstName() + "</li>"));


    }

    private void writeUsersWithCounter(HttpServletRequest req, List<User> userList, PrintWriter writer) {
        Integer coutner = new Integer(req.getParameter("counter"));
        userList.stream().limit(coutner)
                .forEach(e -> writer
                        .write("<li>" + e.getFirstName() + "</li>"));
    }

    private void writeUsers(List<User> userList, PrintWriter writer) {
        writer.write("<ul>");
        userList.forEach(e -> writer.write("<li>" + e.getFirstName() + "</li>"));
        writer.write("</ul>");
    }
}
