package io;

import java.io.*;

/**
 * 字符流java.io.Reader和java.io.Writer
 * <p>
 * java将流按照读写单位划分为字节流和字符流
 * <p>
 * 字节流的超类是:java.io.InputStream和OutputStream
 * <p>
 * 而字符流的超类是:java.io.Reader和java.io.Writer
 * <p>
 * 它们的区别是读写单位不同,字节流最小读写单位为一个字节,而字符流
 * <p>
 * 最小的读写单位为一个char(一个字符)
 * <p>
 * <p>
 * <p>
 * 转换流:java.io.InputStreamReader和java.io.OutputStreamWriter
 * <p>
 * 转换流是常用的字符流实现类,它们是一对高级流,实际开发中我们不会直接
 * <p>
 * 使用它们,但是它们在流连接中是非常重要的一环.
 * <p>
 * <p>
 * 因为其他高级字符流都有一个共同特点,在流连接中只能连接其他的字符流
 * <p>
 * 而真实读写设备的低级流通常都是字节流,这会导致这些高级字符流不能直接
 * <p>
 * 连接字节流,而转换流就在其中起到"转换器"的作用,它可以连接字节流,
 * <p>
 * 并且它又是字符流,其他的字符流可以连接它.而它就负责将字符转换为字节.
 *
 * @Author Izaro
 * @Date 2021/1/29 9:14
 */
public class OSWDemo {
    public static void main(String[] args) throws IOException {
        //向osw.txt文件中写入字符串
        FileOutputStream fos = new FileOutputStream("osw.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        fos.write("夜空中最亮的星,能否听清,".getBytes("UTF-8"));
        fos.write("那仰望的人,心底的孤独和叹息".getBytes("UTF-8"));

        System.out.println("写出完毕!");
        osw.close();
    }
}
