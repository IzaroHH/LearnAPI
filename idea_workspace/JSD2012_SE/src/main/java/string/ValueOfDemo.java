package string;

/**
 * static String valueOf(XXX xxx)
 * <p>
 * String提供了一组重载的静态方法:valueOf,作用是将java中其他类型转换为String
 * <p>
 * 最长使用于将基本类型转换为字符串
 *
 * @Author: Izaro
 * @Date: 2021/1/22 17:16
 */
public class ValueOfDemo {
    public static void main(String[] args) {
        int i = 123;
        String str = String.valueOf(i);
        System.out.println(str);

        double dou = 123.123;
        String str1 = String.valueOf(dou);
        System.out.println(str1);

        String s3 = i + "";
        System.out.println(s3);
        System.out.println(str1 + str);
        System.out.println(str + s3);
    }
}
