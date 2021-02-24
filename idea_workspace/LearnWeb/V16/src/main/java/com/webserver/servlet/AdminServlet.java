package com.webserver.servlet;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @Author Izaro
 * @Date 2021/2/24 20:39
 */
public class AdminServlet {
    public void service(HttpRequest request, HttpResponse response) {
        System.out.println("RegServlet:管理员登录中...");

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || password == null) {
            File file = new File("./webapps/myweb/login_fail1.html");
            response.setEntity(file);
            return;
        }
        System.out.println(username + "," + password);
        if ("HHH".equals(username) && "hhh123456".equals(password)) {
            File file = new File("./webapps/myweb/admin.html");
            response.setEntity(file);
            System.out.println("RegServlet:管理员登录!!!");
        } else {
            File file = new File("./webapps/myweb/login_fail1.html");
            response.setEntity(file);
        }
    }
}

