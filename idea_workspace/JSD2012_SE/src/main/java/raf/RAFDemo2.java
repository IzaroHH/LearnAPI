package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 从文件中读取数据
 * @Author Izaro
 * @Date 2021/1/26 16:16
 */
public class RAFDemo2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("raf.dat","r");
        int d=raf.read();
        System.out.println(d);
        d=raf.read();
        System.out.println(d);
        d=raf.read();
        System.out.println(d);
        System.out.println("输出完毕！");
        raf.close();
    }
}
