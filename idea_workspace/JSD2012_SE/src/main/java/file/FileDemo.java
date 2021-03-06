package file;

import java.io.File;

/**
 * java.io.File可以表示硬盘上的一个文件或目录
 * <p>
 * 使用File可以：
 * <p>
 * 1：访问该文件或目录的属性信息(大小，修改日期，可读可写等)
 * <p>
 * 2：创建或删除文件和目录
 * <p>
 * 3：访问一个目录中的所有子项
 * <p>
 * <p>
 * 但是File不能访问文件中的数据
 *
 * @Author Izaro
 * @Date 2021/1/26 9:39
 */
public class FileDemo {
    /**
     * File创建时可以指定路径
     * <p>
     * 该路径通常使用相对路径，他有更好的跨平台性。
     * <p>
     * <p>
     * <p>
     * 相对路径中"./"表示当前目录，当前目录具体是哪里要视
     * <p>
     * 当前程序的运行环境而定。在idea或eclipse里运行时，
     * <p>
     * 当前目录就是这个程序所在的项目目录。
     *
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("./demo.txt");
        String name=file.getName();
        System.out.println(name);
        long len=file.length();
        System.out.println(len+"字节");

        boolean cr=file.canRead();
        System.out.println("可读:"+cr);
        boolean cw =file.canWrite();
        System.out.println("可写："+cw);
        boolean ih =file.isHidden();
        System.out.println("是否隐藏"+ih);
    }
}
