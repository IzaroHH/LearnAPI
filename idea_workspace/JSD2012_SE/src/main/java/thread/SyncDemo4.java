package thread;

/**
 * @Author Izaro
 * @Date 2021/2/2 19:24
 */
public class SyncDemo4 {


    public static void main(String[] args) {
        Foo foo = new Foo();
        Thread t1 = new Thread() {
            public void run() {
                foo.methodA();
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                foo.methodA();
            }
        };
        t1.start();
        t2.start();
    }
}

class Foo {
    public synchronized void methodA() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + ":正在执行A方法...");
            Thread.sleep(5000);
            System.out.println(t.getName() + ":执行A方法完毕!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void methodB() {
        synchronized (this) {
            try {
                Thread t = Thread.currentThread();
                System.out.println(t.getName() + ":正在执行B方法...");
                Thread.sleep((5000));
                System.out.println(t.getName() + ":执行B方法完毕!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}