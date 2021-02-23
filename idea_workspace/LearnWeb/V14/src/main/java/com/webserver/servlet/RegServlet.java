package com.webserver.servlet;

/**
 * Servlet是JAVAEE标准中的一个接口,意思是运行在服务端的小程序
 * 我们用它来处理某个具体的请求
 * <p>
 * 当前Servlet用于处理用户注册业务
 *
 * @Author Izaro
 * @Date 2021/2/23 15:48
 */
public class RegServlet {
    public void service() {
        System.out.println("RegServlet:开始处理用户注册...");

        System.out.println("RegServlet:用户注册处理完毕!!!");

    }
}
