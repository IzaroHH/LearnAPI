package com.webserver.http;

import java.io.*;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 响应对象,当前类的每一个实例用于表示给客户端发送的一个HTTP响应
 * <p>
 * 每个响应有由三部分构成:
 * <p>
 * 状态行,响应头,相应正文(正文部分可以没有)
 *
 * @Author Izaro
 * @Date 2021/2/19 14:10
 */
public class HttpResponse {
    //状态行相关信息
    /**
     * 状态代码默认值为200,因为绝大多数请求实际应用中都能正确处理
     */
    private int statusCode = 200;
    private String statusReason = "OK";

    //响应头相关信息
    /**
     *
     */
    private Map<String, String> headers = new HashMap<>();
    //响应正文相关信息
    /**
     * 响应正文对应的实体文件
     */
    private File entity;
    /**
     * java.io.ByteArrayOutputStream是一个低级流,其内部维护一个字节数组,通过当前流写出的数据
     * 实际上就是保存在内部的字节数组上了.
     */
    private ByteArrayOutputStream baos = new ByteArrayOutputStream();
    private PrintWriter writer = new PrintWriter(baos);

    private Socket socket;

    public HttpResponse(Socket socket) {
        this.socket = socket;
    }

    /**
     * 将当前响应对象内容以标准的HTTP响应格式发送给客户端
     */
    public void flush() {
        /*
            发送一个响应时,按顺序发送状态行,响应头,响应正文
         */
        sendStatusLine();
        sendHeaders();
        sendContent();
    }
    //发送一个响应的三个步骤:

    /**
     * 1:发送状态行
     */
    private void sendStatusLine() {
        System.out.println("HttpResponse:开始发送状态行...");
        try {
            OutputStream out = socket.getOutputStream();
            String line = "HTTP/1.1" + " " + statusCode + " " + statusReason;
            System.out.println("状态行:" + line);
            println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("HttpResponse:状态行发送完毕!");
    }

    /**
     * 2:发送响应头
     */
    private void sendHeaders() {
        System.out.println("HttpResponse:开始发送响应头...");
        try {
            //遍历headers,将所有响应头发送给客户端
//            Set<Map.Entry<String, String>> set = headers.entrySet();
//            for (Map.Entry<String, String> e : set) {
//                //响应头的名字
//                String name = e.getKey();
//                //响应头的值
//                String value = e.getValue();
//                String line = name+": "+value;
//                System.out.println("响应头:"+line);
//                println(line);
//            }
            //JDK8之后Map也支持foreach,使用lambda表达式遍历
            headers.forEach(
                    (k, v) -> {
                        String line = k + ": " + v;
                        System.out.println("响应头:" + line);
                        try {
                            println(line);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
            );


            //单独发送CRLF表示响应头部分发送完毕
            println("");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("HttpResponse:响应头发送完毕!");
    }

    /**
     * 3:发送响应正文
     */
    private void sendContent() {
        System.out.println("HttpResponse:开始发送响应正文...");
        //先查看ByteArrayOutputStream中是否有数据,如果有则把这些数据作为正文发送
        //先确保通过PrintWriter写出的内容都写入ByteArrayOutputStream内部数组上
        writer.flush();
        //通过ByteArrayOutputStream得到其内部的字节数组
        byte[] data = baos.toByteArray();
        //若存在数据,则将它作为正文回复客户端
        if (data.length > 0) {
            try {
                OutputStream out = socket.getOutputStream();
                out.write(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (entity != null) {
            try (
                    //创建文件输入输入流要发送的文件数据
                    FileInputStream fis = new FileInputStream(entity);
            ) {
                OutputStream out = socket.getOutputStream();
                int len;
                //每次读取的字节数
                byte[] buf = new byte[1024 * 10];
                //10kb字节数组
                while ((len = fis.read(buf)) != -1) {
                    out.write(buf, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("HttpResponse:响应正文发送完毕!");
    }

    private void println(String line) throws IOException {
        OutputStream out = socket.getOutputStream();
        byte[] data = line.getBytes("ISO8859-1");
        out.write(data);
        out.write(13);
        out.write(10);
    }

    /**
     * 添加一个响应头
     *
     * @param name
     * @param value
     */
    public void putHeader(String name, String value) {
        headers.put(name, value);
    }

    public File getEntity() {
        return entity;
    }

    public void setEntity(File entity) {
        this.entity = entity;
        String fileName = entity.getName();
        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);
        String type = HttpContext.getMimeType(ext);
        putHeader("Content-Type", type);
        putHeader("Content-Length", entity.length() + "");
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusReason() {
        return statusReason;
    }

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * 对外提供一个缓冲字符输出流,通过这个输出流写出的字符串最终都会写入当前响应对象的属性:
     * private ByteArrayOutputStream baos中.这相当于写入到该对象内部维护的字节数组总了.
     *
     * @return
     */
    public PrintWriter getWriter() {
        return writer;
    }

}
