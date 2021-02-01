package thread;

/**
 * 多线程
 * <p>
 * 多线程可以让多个代码片段并发执行,造成一种同时运行的
 * <p>
 * 方法一:继承Thread并重写run方法
 *
 * @Author Izaro
 * @Date 2021/2/1 11:28
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread1();
        Thread t2 = new MyThread2();
    /*
        注意,启动线程的时候要调用现成的start方法,而不是直接调用run方法!
        线程调用start方法后会纳入到线程调度器中,线程调度器会分配CPU时间片段给
        当前线程使得它可以和其他线程并发运行.
        当该线程第一次获取时间片段时会自动执行run方法
     */
        t1.start();
        t2.start();
    }
}

/**
 * 第一种创建线程的方式优点在于结构简单,利于匿名内部类形式创建.
 * <p>
 * 缺点有两个:
 * <p>
 * 1:由于java是单继承的,这导致如果继承了Thread就无法再继承其他类去复用方法,实际开发中
 * <p>
 * 是非常不方便的.
 * <p>
 * 2:定义线程的同时重写了run方法,这导致将任务直接定义在了线程中使得线程与任务存在必然
 * <p>
 * 的耦合关系,不利于线程的重用.
 */
class MyThread1 extends Thread {
    @Override
    public void run() {
        int key = 1000;
        for (int i = 0; i < key; i++) {
            System.out.println("Who are u?");

        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int key = 1000;
        for (int i = 0; i < key; i++) {
            System.out.println("FBI!Open the door!!!");
        }
    }
}