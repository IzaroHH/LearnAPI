package file;

import java.io.File;

/**
 * 删除目录
 * @Author Izaro
 * @Date 2021/1/26 11:36
 */
public class DeleteDitDemo {
    public static void main(String[] args) {
        //将当前目录下的demo目录删除
        File dir=new File("./a");
        if(dir.exists()){
            dir.delete();
            System.out.println("目录已删除！");

        }else{
            System.out.println("目录不存在！");
        }
    }
}
