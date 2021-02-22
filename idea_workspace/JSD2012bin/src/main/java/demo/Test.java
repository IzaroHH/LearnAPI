package demo;

/**
 * @Author: Izaro
 * @Date: 2021/1/23 20:12
 */
public class Test {
        public static void main(String[] args) {
            new Thread(new Runnable() {
                public void run() {
                    System.out.print("bar");
                }
            }).start();
        }
    }
