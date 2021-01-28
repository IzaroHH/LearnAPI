package raf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 读取文本数据
 *
 * @Author Izaro
 * @Date 2021/1/27 14:02
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        RandomAccessFile a1 = new RandomAccessFile("raf.txt", "rw");
        byte[] data = new byte[(int) a1.length()];
        a1.read(data);
        String line = new String(data, "UTF-8");
        System.out.println(line);
        String a2 = "吴中羁客感年华";
        byte[] data1 = a2.getBytes("UTF-8");
        a1.write(data1);
        System.out.println("OVER!");
        a1.close();
    }
}

