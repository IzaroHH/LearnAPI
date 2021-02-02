package thread;

/**
 * sleep方法要求必须处理中断异常.(Thread还提供了其他会导致线程阻塞的方法,很多都要求处理
 * <p>这个异常,情况是一样的.)
 * <p>
 * <p>当一个线程调用sleep方法处于睡眠阻塞的过程中,此时该线程的interrupt方法被调用时,会中断
 * <p>这个阻塞过程,此时该方法会抛出中断异常.
 *
 * @Author Izaro
 * @Date 2021/2/2 9:07
 */
public class SleepDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread lin = new Thread() {
            public void run() {
                System.out.println("林:刚美完容,睡一会吧...");
                try {
                    Thread.sleep(1000000000);
                } catch (InterruptedException e) {
                    System.out.println("林:干嘛呢!干嘛呢!干嘛呢!干嘛呢!干嘛呢!");
                }
                System.out.println("林:草!");
            }
        };
        Thread huang = new Thread() {
            public void run() {
                System.out.println("黄:大锤80!小锤40!开始砸墙!");
                for (int i = 0; i < 5; i++) {
                    System.out.println("黄:80!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
                lin.interrupt();
                System.out.println("哐当!");
                System.out.println("黄:搞定!");

            }
        };
        lin.start();
        huang.start();
    }
}