package com.yorick.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yorick on 2017/8/29.
 */
@WebServlet(name="LoginServlet", urlPatterns={"/myshop/login.do"}, loadOnStartup=1)
public class LoginServlet extends HttpServlet {

    /**
     * 用于处理用户登录
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    /**
     * 用于处理用户登录, 仅允许post方式的请求, get方式 返回 请求方式错误.
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }
}
