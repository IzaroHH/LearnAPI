package string;

/**
 * boolean startsWith(String str)
 * <p>
 * 判断字符串是否是以给定的字符串开始的
 *
 * <p>
 * <p>
 * boolean endsWith(String str)
 * <p>
 * 判断字符串是否是以给定的字符串结尾的
 *
 * @Author: Izaro
 * @Date: 2021/1/22 16:54
 */
public class StartsWithDemo {
    public static void main(String[] args) {
        String str = "www.tedu.cn";
        boolean str1 = str.startsWith("www");
        System.out.println("Starts:" + str1);
        boolean str2 = str.endsWith("cn");
        System.out.println("Ends:" + str2);
        boolean str3 = str.endsWith("/");
        System.out.println("Ends:" + str3);
        boolean str4 = str.startsWith("/");
        System.out.println("Starts:" + str4);
    }
}
