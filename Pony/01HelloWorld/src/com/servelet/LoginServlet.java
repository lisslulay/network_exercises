package com.servelet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 处理登录请求
 * 1.继承HttpServlet，才能够处理HTTP请求
 * 2.使用@WebServlet，说明它要处理的请求路径
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //得到参数 req.getParameter("username")
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username" + username);
        System.out.println("password" + password);

        //写回 resp.getWriter().write("想写的东西");
        if (username.equals("123") && password.equals("456")) {
            resp.getWriter().write("<h1>Success!!!</h1>");
        } else {
            resp.getWriter().write("<h1>Failure!!!</h1>");
        }
    }
}
