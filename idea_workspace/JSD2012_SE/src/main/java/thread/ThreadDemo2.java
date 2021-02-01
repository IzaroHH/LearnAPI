package thread;

/**
 * 第二次中创建线程的方法
 * 实现Runable接口单独定义线程任务
 *
 * @Author Izaro
 * @Date 2021/2/1 14:03
 */
public class ThreadDemo2 {
    public static void main(String[] args) {

        //创建要并发运行的任务
        Runnable r1 = new MyRunnable1();
        Runnable r2 = new MyRunnable2();

        //创建线程
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

    }
}

class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Who are u?");
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("FBI!Open the door!");
        }
    }
}