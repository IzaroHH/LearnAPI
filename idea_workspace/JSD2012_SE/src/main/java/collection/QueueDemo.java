package collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列
 * 队列可以保存一组元素,但是存放元素必须遵循先进先出原则
 * <p>
 * java.util.Queue接口
 * Queue继承自Collection,常用实现类:java.util.LinkedList
 *
 * @Author Izaro
 * @Date 2021/2/5 14:01
 */
public class QueueDemo {
    public static void main(String[] args) {
        /*
            由于LinkedList内部是由链表实现的,而链表结构首位增删元素性能好,因此java让
            LinkedList作为了Queue的实现类使用
         */
        Queue<String> queue = new LinkedList<>();
        queue.offer("one");
        queue.offer("two");
        queue.offer("three");
        queue.offer("four");
        queue.offer("five");
        System.out.println(queue);
        System.out.println("size:" + queue.size());

        //遍历可以获取队列每一个元素,并且不影响元素在队列中
        for (String s : queue) {
            System.out.println(s);
        }
        System.out.println(queue);


        //使用poll方法遍历则是一次性的
        while (queue.size() > 0) {
            str = queue.poll();
            System.out.println(str);
        }
        System.out.println(queue);
    }
}
