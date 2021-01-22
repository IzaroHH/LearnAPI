package string;

/**
 * @Author: Izaro
 * @Date: 2021/1/22 16:41
 * String trim()
 * 去除字符串两边的空白字符
 */
public class TrimDemo {
    public static void main(String[] args) {
        String str = "   hello            ";
        System.out.println(str);
        String str1 = str.trim();
        System.out.println(str1);
    }
}
