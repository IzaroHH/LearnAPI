package demo;

import java.util.Random;

/**
 * @Author: Izaro
 * @Date: 2021/1/23 9:37
 */
public class Demo01 {
    public static void main(String[] args) {
       /*int n = 14;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(n);*/
        /*for (int i = 0; i <= 3; i++) {
            System.out.print("00000000 ");
        }*/
        // System.out.println();
        //  int i[]=new int[20];
        for (int i = 0; i <= 200; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
        // Random ran = new Random();
        //?如何随机抽取20个数，并补全32位0；
        int num = 0xdeec;
        System.out.println(num);
        System.out.println(Integer.toBinaryString(num));
    }

}
