package integer;

/**
 * 包装类
 * <p>
 * 包装类是为了解决基本类型不能直接参与面向对象开发的问题，是基本
 * <p>
 * 类型可以以对象的方式存在
 * <p>
 * 包装类型都定义在java.lang包中作为基础使用。6个数字类型的包装类
 * <p>
 * 继承自Number，其余两个直接继承Object.
 *
 * @Author: Izaro
 * @Date: 2021/1/25 16:50
 */
public class IntegerDemo {
    public static void main(String[] args) {
        int d = 127;
        Integer i1 = Integer.valueOf(d);
        Integer i2 = Integer.valueOf(d);
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
        int i = i1.intValue();
        System.out.println(i);
        double dou = i1.doubleValue();
        System.out.println(dou);
    }

}
