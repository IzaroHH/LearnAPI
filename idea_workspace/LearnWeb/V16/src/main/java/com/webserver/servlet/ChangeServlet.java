package com.webserver.servlet;

import com.webserver.http.HttpRequest;
import com.webserver.http.HttpResponse;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @Author Izaro
 * @Date 2021/2/24 20:00
 */
public class ChangeServlet {
    public void service(HttpRequest request, HttpResponse response) {
        System.out.println("RegServlet:开始处理用户修改密码...");

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password_new=request.getParameter("password_new");

        if (username == null || password == null||password_new==null) {
            File file = new File("./webapps/myweb/login_fail1.html");
            response.setEntity(file);
            return;
        }
        System.out.println(username + "," + password);

        try (
                RandomAccessFile raf = new RandomAccessFile("user.dat", "rw");
        ) {
            boolean login = false;
            for (int i = 0; i < raf.length() / 100; i++) {
                //读取用户名
                byte[] data = new byte[32];
                raf.read(data);
                String username1 = new String(data, "UTF-8").trim();
                raf.read(data);
                String password1 = new String(data, "UTF-8").trim();
                if (username1.equals(username)) {
                    login = true;
                } else {
                    raf.seek(i * 100 + 100);
                }
                if (login) {
                    if (password.equals(password1)) {
                        raf.seek(i * 100 + 32);
                        byte[] data1 = password_new.getBytes("UTF-8");
                        data1 = Arrays.copyOf(data1, 32);
                        raf.write(data1);
                        File file = new File("./webapps/myweb/change_password_success.html");
                        response.setEntity(file);
                        break;
                    } else {
                        File file = new File("./webapps/myweb/login_fail.html");
                        response.setEntity(file);
                        break;
                    }
                }
                if (i == raf.length() / 100 - 1) {
                    File file = new File("./webapps/myweb/login_fail.html");
                    response.setEntity(file);
                    return;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("RegServlet:用户登录处理完毕!!!");
    }
}

