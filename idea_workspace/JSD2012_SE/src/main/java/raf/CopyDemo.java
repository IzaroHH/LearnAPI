package raf;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制
 *
 * @Author Izaro
 * @Date 2021/1/26 16:54
 */
public class CopyDemo {
    /**
     * 复制原理：从源文件中顺序读取每个字节并写入到另一个文件中
     *
     * @param args
     * @return void
     * @create 2021/1/26 17:06
     */
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("image.jpg", "rw");
        RandomAccessFile desc = new RandomAccessFile("image_cp.jpg", "rw");
        /*
         * image.jpg:
         * 00100110 11011011 10001111 11011011 10001111 ....
         *
         * d:00000000 00000000 00000000 10001111
         *
         * image_cp.jpg
         * 00100110 11011011 10001111 11011011 10001111 ....
         */
        int d;
        while ((d = src.read()) != -1) {
            desc.write(d);

        }
        System.out.println("复制成功");
    }
}
