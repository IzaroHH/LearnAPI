package file;

import java.io.File;

/**
 * 创建一个多级目录
 * @Author Izaro
 * @Date 2021/1/26 11:24
 */
public class MkDirsDemo {
    public static void main(String[] args) {
        //在当前目录下新建目录/a/b/c/d/e/f
        File dir =new File("./a/b/c/d/e/f");
        if(dir.exists()){
            System.out.println("该目录已存在！");
        }else{
            dir.mkdirs();
            System.out.println("目录已创建！");
        }
    }
}
