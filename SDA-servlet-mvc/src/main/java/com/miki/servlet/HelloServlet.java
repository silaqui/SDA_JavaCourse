package com.miki.servlet;

import com.miki.controller.Controller;
import com.miki.controller.CookieControler;
import com.miki.controller.LoginController;
import com.miki.controller.UserController;
import org.apache.commons.lang3.StringUtils;
import pl.sda.file.FileOperation;
import pl.sda.file.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Miki on 01.03.2017.
 */
public class HelloServlet extends HttpServlet {

    private Map<String, Controller> controllerMap;

    @Override
    public void init() throws ServletException {
        this.controllerMap = new HashMap<String, Controller>();
        controllerMap.put("users", new UserController());
        controllerMap.put("login", new LoginController());
        controllerMap.put("cookie", new CookieControler());
        controllerMap.put("default", (requests, response) ->
                response.getWriter().write("<h1>Hello World from default control</h1>"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String requestURI = req.getRequestURI();
        String realtivePath = requestURI.substring(StringUtils.ordinalIndexOf(requestURI, "/", 2) + 1);

        Controller controller = controllerMap.get(realtivePath);
        if (controller == null)
        {
            controller = controllerMap.get("default");
        }

        controller.handleGet(req, resp);

//        PrintWriter writer = resp.getWriter();
//        writer.write("<h1>hello world</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BufferedReader reader = req.getReader();
        String body = reader.readLine();
        String[] nameList = body.split(" ");
        User newUser = new User();
        newUser.setFirstName(nameList[0]);
        newUser.setLastName(nameList[1]);
        newUser.setAge(new Integer(nameList[2]));

        File file = new File("C:\\Users\\Miki\\Desktop\\test.txt");
        FileOperation.addUserToFile(newUser,file);

        resp.getWriter().write("All good");
        resp.setStatus(201);

    }
}
