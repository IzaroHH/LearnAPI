package file;

import java.io.File;
import java.io.FileFilter;

/**
 * 获取一个目录中满足指定条件的所有子项
 * <p>
 * File[] listFiles(FileFilter filter)
 * <p>
 * 将当前File对象表示的目录中所有符合给定过滤器要求的子项返回。
 * <p>
 * 该方法会将该目录中所有的子项都经过一次给定的过滤器，然后仅保留
 * <p>
 * 并返回符合要求的子项。
 *
 * @Author Izaro
 * @Date 2021/1/26 14:05
 */
public class ListFilesDemo2 {
    /**
     * 获取当前目录中的所有名字中含有字母"e"的子项
     *
     * @param args
     */
    public static void main(String[] args) {
        File dir = new File(".");
        if (dir.isDirectory()) {
            //           MyFilter filter=new MyFilter();
            FileFilter filter = (file) -> file.getName().contains("e");
            File[] subs = dir.listFiles(filter);
            System.out.println("子项个数：" + subs.length);
            for (int i = 0; i < subs.length; i++) {
                System.out.println(subs[i].getName());
            }
        }
    }
}

/*
class MyFilter implements FileFilter {
    */
/*
      该方法的作用就是定义参数file是否符合要求，符合则返回true
     *//*

    @Override
    public boolean accept(File file) {
        //凡是名字中含有"e"的就是接受
        String name = file.getName();
        System.out.println("正在过滤："+name);
        boolean contains = name.contains("e");
        return contains;
    }
}*/
