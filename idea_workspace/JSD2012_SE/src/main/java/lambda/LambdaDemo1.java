package lambda;

import java.io.File;
import java.io.FileFilter;

/**
 * JDK8之后推出了一个新的特性：lambda表达式
 * <p>
 * lambda表达式可以用更简短的语法创建匿名内部类。
 * <p>
 * 语法：
 * <p>
 * (参数列表)->{
 * <p>
 * 方法体
 * <p>
 * }
 * <p>
 * 需要注意，使用lambda表达式创建时实现的接口中只能有一个抽象方法！
 *
 * @Author Izaro
 * @Date 2021/1/26 14:31
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        FileFilter filter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().contains("e");
            }
        };
        FileFilter filter1 = (file)->file.getName().contains("e");


    }
}
