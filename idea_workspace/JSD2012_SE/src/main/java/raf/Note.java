package raf;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 简易记事本工具
 * <p>
 * 程序启动后要求用户输入一个文件名，然后对该文件进行操作。
 * <p>
 * 之后用户在控制台输入的每一行字符串都写入到该文件中。（不用考虑换行问题）
 * <p>
 * 当用户单独输入"exit"时程序退出。
 *
 * @Author Izaro
 * @Date 2021/1/27 11:23
 */
public class Note {
    public static void main(String[] args) throws IOException {

        System.out.println("请输入文件名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        RandomAccessFile raf = new RandomAccessFile(name + ".txt", "rw");
        System.out.println("请输入内容：(exit退出)");
        while (true) {
            String str = sc.nextLine();
            if ("exit".equals(str)) {
                System.out.println("退出！");
                break;
            }
            byte[] data = str.getBytes("UTF-8");
            raf.write(data);
            System.out.println("写出完毕！");

        }
        raf.close();
        System.out.println("再见！");
    }
}