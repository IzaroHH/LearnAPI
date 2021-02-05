package collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.util.List接口
 * List继承字Collection,是集合中最常用的一类集合.特点是:可以存放重复元素并且有序.
 * List中定义了一套可以通过下标操作元素的方法,使用更方便.
 * <p>
 * List常用实现类
 * Java.util.ArrayList:内部使用数组实现,查询性能更好
 * Java.util.LinkedList:内部使用链表实现,增删性能更好
 * 在没有对集合对应性能有非常严苛的要求时,通常首选使用ArrayList
 *
 * @Author Izaro
 * @Date 2021/2/4 14:25
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        System.out.println(list);

    /*
        E set(int index,E e)
        将给定元素设置到指定位置,返回值为该位置原有元素.
        相当于是替换现在元素操作
     */
        //[one,2,three,four,five]
        String old = list.set(1, "2");
        System.out.println(list);
        System.out.println(old);
        //被替换的元素two

        /*
            再不创建新集合的前提下,将集合元素反转
            就利用get,set方法实现
         */
        for (int i = 0; i < list.size() / 2; i++) {
            //获取正数位置上的元素
            String str = list.get(i);
            //将整数位置的元素替换倒数位置的元素
            str = list.set(list.size() - 1 - i, str);
            //将原倒数位置的元素设置到正数位置上完成交换
            list.set(i, str);
        }
        //[five,four,three,2,one]
        System.out.println(list);
        /*
         * java.util.Collections是集合的工具类,里面提供了很多操作集合的方法
         * reverse(List list)用于反转集合操作
         */
        Collections.reverse(list);
        System.out.println(list);
    }
}
