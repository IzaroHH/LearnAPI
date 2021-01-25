package string;

/**
 * String trim()
 * <p>
 * 去除字符串两边的空白字符
 *
 * @Author: Izaro
 * @Date: 2021/1/22 16:41
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str = "   hello            ";
        System.out.println(str);
        String str1 = str.trim();
        System.out.println(str1);
    }
}
