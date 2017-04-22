package com.miki.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Created by Miki on 01.03.2017.
 */
public class UserController implements Controller {




    public void handleGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();
        writer.write("<h1>Hello World from UserController</h1>");
    }
}
