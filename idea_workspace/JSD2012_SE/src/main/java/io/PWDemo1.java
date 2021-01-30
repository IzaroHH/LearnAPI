package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * 缓冲字符输出流
 * <p>
 * java.io.BufferedWriter
 * <p>
 * 内部有缓冲区,可以块写文本数据来加快写出数据速度
 * <p>
 * <p>
 * <p>
 * java.io.PrintWriter
 * <p>
 * 具有自动行刷新的缓冲字符输出流,内部总是连接BufferedWriter作为其
 * <p>
 * 缓冲功能.
 *
 * @Author Izaro
 * @Date 2021/1/29 10:19
 */
public class PWDemo1 {
    /**
     * 向pw.txt文件中写入字符串
     * <p>
     * PW提供了直接对文件做操作的构造方法
     * <p>
     * PrintWriter(String path)
     * <p>
     * PrintWriter(File file)
     */
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
        pw.println("让我掉下眼泪的,不止昨夜的酒");
        pw.println("让我依依不舍地,不止你的温柔");
        System.out.println("写出完毕!");
        pw.close();
    }
}
