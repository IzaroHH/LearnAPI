package string;

/**
 * @Author: Izaro
 * @Date: 2021/1/25 9:03
 * String的优化导致其为不变对象这会存在利于重用但是不利于修改操作
 * 频繁修改String会降低性能并有较多的系统开销
 * java.lang.StringBuilder是专门设计用来修改String的API，其内部维护
 * 一个可变的char数组，并提供了多种修改字符串内容的方法，例如：增删改查,
 * 和String原有的相关方法：indexOf，length等等
 * StringBuilder修改String内容速度快，开销小
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String str="好好学习,JAVA";
        StringBuilder builder =new StringBuilder();
        StringBuilder builder1=new StringBuilder(str);
        builder1.append("，早点下课，早点放学，早点休息。");
        str=builder1.toString();
        System.out.println(str);
        builder1.replace(0,10,"PYTHON");
        System.out.println(builder1);
        builder1.delete(0,8);
        System.out.println(builder1);
        builder1.insert(3,"玩，");
        System.out.println(builder1);
        builder1.reverse();
        System.out.println(builder1);
    }

}
