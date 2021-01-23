package demo;

/**
 * @Author: Izaro
 * @Date: 2021/1/23 16:55
 */
public class Demo06 {
    public static void main(String[] args) {
        int n = 0x6e188fd5;
        int m = 0xff;
        int k = n & m;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(~k+1);
    }
}
