package day04;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 改正下面程序的错误
 * <p>
 * 在解决错误的同时，用注释标注什么原因导致问题的出现
 * <p>
 * 程序功能需求:使用块读写方式复制指定的文件
 * <p>
 * 单词记一记:
 * src  是单词source的缩写形式，表示来源
 * 下面使用src表示源文件，就是复制的数据来源的文件
 * <p>
 * read 读
 * write 写
 * close 关闭
 *
 * @author Xiloer
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile src = new RandomAccessFile("./test.txt", "rw");
        RandomAccessFile desc = new RandomAccessFile("./test_cp.txt", "rw");
        int len;
        byte[] data = new byte[1024 * 10];
        while ((len = src.read(data)) != -1) {
            desc.write(data, 0, len);
        }
        System.out.println("复制完毕!");
        src.close();
        desc.close();
    }

}
