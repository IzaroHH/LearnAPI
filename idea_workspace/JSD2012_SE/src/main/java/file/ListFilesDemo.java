package file;

import java.io.File;

/**
 * 获取一个目录中的所有子项
 *
 * @Author Izaro
 * @Date 2021/1/26 11:45
 */
public class ListFilesDemo {
    /**
     * boolean isFile()
     * <p>
     * 判断当前File表示的是否为一个文件
     * <p>
     * boolean isDirectory()
     * <p>
     * 判断当前File表示的是否为一个目录
     */
    public static void main(String[] args) {
        //获取当前目录中的所有子项并输出
        File dir = new File(".");
        if (dir.isDirectory()) {
            File[] subs = dir.listFiles();
            System.out.println(subs.length);
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i].getName());
            }
        }
    }
}
