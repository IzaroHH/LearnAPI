package object;

import java.awt.*;

/**
 * @Author: Izaro
 * @Date: 2021/1/25 17:33
 * 测试Object中常见方法
 */
public class Test {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        /*
        Object中定义了方法：
        String toString()
        作用是将当前对象转换为String
        Object中该方法的实现返回的字符串格式为：类名@地址
         */
        String str = p.toString();
        System.out.println(str);
        /*
        向控制台输出时很常用的操作，当    输出一个对象时，
        实际是该方法会调用该对象的toString方法，将返回的
        字符串输出到控制台
         */
        System.out.println(p);
        /*
        字符串与其他类型链接时，会将其他类型转换为String
        而转换也是依靠该对象的toString
        下面的代码实际上是将p.toString()返回的字符串连接的
         */
        String line = "这个对象是:" + p;
        System.out.println(line);

        Point p2 = new Point(1, 2);
        System.out.println(p == p2);
        /*
        Object提供的是另一个常用：
        boolean equals(Object o)
        该方法的作用时比较当前对象的与参数给定的对象内容是否相同
        但是如果子类不重写这个方法，则该方法毫无价值。应为Object
        实现该方法时用的时"=="比较的。
         */
        System.out.println(p.equals(p2));
    }
}
