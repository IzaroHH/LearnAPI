package io;

import java.io.*;

/**
 * 使用文件流完成文件的赋值操作
 *
 * @Author Izaro
 * @Date 2021/1/28 11:25
 */
public class CopeDemo {
    /**
     * 1.循环文件输入流读取源文件
     * <p>
     * 2.创建文件输出流写入复制文件
     * <p>
     * 3.循环块读写完成复制
     * <p>
     * 4.关闭两个流
     */
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("fos.txt");
        FileOutputStream fos = new FileOutputStream("fos_cp.txt");
        byte[] data = new byte[1];
        int len1;
        long start = System.currentTimeMillis();
        while ((len1 = fis.read(data)) != -1) {
            fos.write(data,0,len1);
        }

        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时" + (end - start) + "ms");
        fis.close();
        fos.close();
    }
}
