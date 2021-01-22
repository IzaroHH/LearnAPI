package string;

/**
 * @Author: Izaro
 * @Date: 2021/1/22 16:01
 * String substring(int start, int end)
 * 截取指定范围内的字符串，两个参数分别是范围对应的下标。
 * 注：在JAVA API中通常使用两个数字表示范围时都是“含头不含尾”的
 */
public class SubstringDemo {
    public static void main(String[] args) {
        //             01234567890
        String host = "www.tedu.cn";
        String sub = host.substring(4, 8);
        System.out.println(sub);

        sub=host.substring(4);
        System.out.println(sub);

        sub=host.substring(2,5);
        System.out.println(sub);
    }
}
