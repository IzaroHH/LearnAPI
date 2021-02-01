package thread;

/**
 * 使用匿名内部类的形式完成两种线程的创建
 *
 * @Author Izaro
 * @Date 2021/2/1 14:13
 */
public class TreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run(){
                for(int i=0;i<1000;i++){
                    System.out.println("Who are u?");
                }
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000;i++){
                    System.out.println("FBI!Open the door!");
                }
            }
        };
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}

