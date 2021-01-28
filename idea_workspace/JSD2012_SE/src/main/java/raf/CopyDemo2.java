package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 通过提高每次读写的数据量减少世界读写的次数可以提高读写效率
 * <p>
 * 单字节读写是随机读写
 * <p>
 * 一组字节读写是块读写
 * <p>
 * 对于机械硬盘而言，单字节读写几乎没有效率可言，块读写效率很好.
 * <p>
 * 对大部分硬件而言，减少硬件调用次数都可以提高效率。
 *
 * @Author Izaro
 * @Date 2021/1/27 9:15
 */
public class CopyDemo2 {
    /**
     * RAF提供的块读取方法：
     * <p>
     * 块读：
     * <p>
     * int read(byte[] data)
     * <p>
     * 一次性从文件中读取给定的字节数组data总长度的字节量并将
     * <p>
     * 读取到的字节顺序的存入到该数组中。返回值为实际读取到的
     * <p>
     * 字节量。如果返回值为-1则表示读取到了文件末尾
     * <p>
     * 文件数据：
     * <p>
     * 11011010 00110101 01110101 11010010 01100010 00101010
     * <p>
     * <p>
     * 块读操作：
     * <p>
     * byte[]data =new byte[6];
     * <p>
     * data:[00000000,00000000,00000000,00000000,00000000,00000000]
     * <p>
     * int len=raf.read(data);
     * <p>
     * data:[11011010 00110101 01110101 11010010 01100010 00101010]
     * <p>
     * len:6
     * <p>
     * 与单字节读取的区别：
     * <p>
     * int d=raf.read();
     *
     * @param args
     */
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("driver.exe", "rw");
        RandomAccessFile desc = new RandomAccessFile("driver_cp.exe", "rw");
        int len;
        byte[] data = new byte[1024 * 10];
        long start = System.currentTimeMillis();
        while ((len = src.read(data)) != -1) {
            desc.write(data,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时" + (end - start) + "ms");
        src.close();
        desc.close();
    }
}
