package io;

import java.io.*;

/**
 * 使用流连接形式创建PW完成文本数据的读写操作
 *
 * @Author Izaro
 * @Date 2021/1/29 10:44
 */
public class PWDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("pw2.txt");
        OutputStreamWriter osw =new OutputStreamWriter(fos,"UTF-8");
        BufferedWriter bw=new BufferedWriter(osw);
        PrintWriter pw=new PrintWriter(bw);
        pw.println("字节输出流->转换输出流->缓冲输出流->高级流行写字符串");
        System.out.println("输出完毕");
        pw.close();
    }
}
