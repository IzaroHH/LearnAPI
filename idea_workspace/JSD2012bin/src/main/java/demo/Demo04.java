package demo;

/**
 * @Author: Izaro
 * @Date: 2021/1/23 14:43
 */
public class Demo04 {
    public static void main(String[] args) {
        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        long lmax=Long.MAX_VALUE;
        long lmin=Long.MIN_VALUE;
        System.out.println(Integer.toBinaryString(max));
        System.out.println(Integer.toBinaryString(min));
        System.out.println(Long.toBinaryString(lmax));
        System.out.println(Long.toBinaryString(lmin));
        String smax=Long.toBinaryString(lmax)+"";
        String smin=Long.toBinaryString(lmin)+"";
        System.out.println(smax.length());
        System.out.println(smin.length());
    }
}
