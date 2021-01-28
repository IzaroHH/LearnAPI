package raf;


import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * <p>
 * RAF是专门用来读写文件的类。其基于指针对文件进行随机读写。
 *
 * @Author Izaro
 * @Date 2021/1/26 15:18
 */
public class RAFDemo1 {
    /**
     * 相对当前目录下的raf.dat文件进行操作
     * <p>
     * RAF常用构造器
     * <p>
     * RandomAccessFile(File file,String mode)
     * <p>
     * RadnomAccessFile(String path,String mode)
     * <p>
     * 第一个参数为要进行读写的文件，可以传入file对象也可以
     * <p>
     * 直接给定该文件的路径。
     * <p>
     * 第二个参数为操作模式，有两种：
     * <p>
     * "r"：只读模式，仅对该文件做读取数据操作
     * <p>
     * "rw":读写模式，对文件读写均可。
     *
     * @param args
     * @return void
     * @create 2021/1/26 15:31
     */
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(
                "./raf.dat", "rw");
        raf.write(-2);
        raf.write(250);
        System.out.println("写出完毕！");
        raf.close();
    }

}
