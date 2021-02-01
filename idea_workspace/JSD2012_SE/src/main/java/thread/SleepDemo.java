package thread;

import java.util.Scanner;

/**
 * 线程提供的方法
 * <p>static void sleep(long ms)
 * <P>该方法可以让运行这个方法的线程处于阻塞状态指定毫秒.超时后线程会自动回到RUNNABLE状态
 * <p>再次获取时间片并发运行
 *
 * @Author Izaro
 * @Date 2021/2/1 17:10
 */
public class SleepDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("输入你想计时的秒数:");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        System.out.println("程序开始了...");
        Thread.sleep(1000);
        /*
            完成一个倒计时程序,程序启动后要求用户输入一个数字.然后从该数字开始
            每秒递减,到0时提示时间到.
         */
        try {
            for (int i = t; i >=0; i--) {
                System.out.println("倒计时:" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("程序结束了...");
    }
}
