package com.miki.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Miki on 01.03.2017.
 */
public interface Controller {

    void handleGet(HttpServletRequest request, HttpServletResponse response) throws IOException;



}
