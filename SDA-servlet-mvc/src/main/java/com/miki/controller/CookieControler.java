package com.miki.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Miki on 01.03.2017.
 */
public class CookieControler implements Controller {

    @Override
    public void handleGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Cookie cookie = new Cookie ("hello","wordl");
        cookie.setMaxAge(1000);
        response.addCookie(cookie);

        response.getWriter().write("<h1>Hello from CookieController </h1>");
    }
}
