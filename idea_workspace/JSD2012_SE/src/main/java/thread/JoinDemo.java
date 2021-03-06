package thread;

/**
 * 线程提供了一个方法:
 * <p>
 * void join()
 * <p>
 * 该方法允许一个线程在另一个线程上等待,直到该线程结束后才会结束等待进行自己后续操作.
 * <p>
 * 例如:
 * <p>
 * A,B是两条线程
 * <p>
 * 当A线程调用了B.join()后,A线程处于阻塞状态,直到B线程结束,A线程才能解除阻塞执行join
 * <p>
 * 方法后续代码.
 * <p>
 * join方法可以协调线程的同步运行.
 * <p>
 * 同步运行:多个线程执行存在先后顺序执行.
 * <p>
 * 异步运行:多个线程各干各的,线程之间本省就是异步运行的.
 *
 * @Author Izaro
 * @Date 2021/2/2 10:24
 */
public class JoinDemo {
    private static boolean isFinish = false;
    //Firebac VS Jaygee @ Stay Alive vol.4 Popping Final
    public static void main(String[] args) {
        /*0.
            一个方法的局部内部类中若应用了这个方法的其他局部变量时,这个变量必须被声明为
            final的(JDK8折后,可以不再显示的使用final关键字修饰这个局部变量,但是
            如果被该方法的其他局部变量引用时,它仍然时final的)
         */
        //final boolean isFinish =false;
        Thread download = new Thread() {
            public void run() {
                System.out.println("down:开始下载图片...");
                for (int i = 1; i <= 100; i++) {
                    System.out.println("down:" + i + "%");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("down:图片下载完毕!");
                isFinish = true;
            }
        };
        Thread show = new Thread() {
            public void run() {
                System.out.println("show:开始显示文字...");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println("show:显示文字完毕!");
                //但是显示图片这件事必须等待download执行完毕(图片下载完毕)再进行!
                //阻塞show线程,直到download执行完毕后再进行后续工作
                try {
                    System.out.println("show:开始等待download下载图片...");
                    download.join();//使show线程排在download后面等待其完成
                    System.out.println("show:等待download完毕!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("show:开始显示图片...");
                if (!isFinish) {//如果图片没有下载完毕
                    //当一个异常抛出到线程任务的run方法之外时,这个线程就会结束.
                    throw new RuntimeException("图片加载失败!");
                }
                System.out.println("show:显示图片完毕!");
            }
        };
        download.start();
        show.start();
    }
}
