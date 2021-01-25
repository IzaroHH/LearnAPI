package string;

/**
 * String支持正则表达式的方法一：
 * <p>
 * 使用给定的正则表达式验证当前字符串是否符合格式要求  符合则返回true
 *
 * @Author: Izaro
 * @Date: 2021/1/25 11:55
 */
public class MatchesDemo {
    public static void main(String[] args) {
        String email = "fa_ncq@tedu.com";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = email.matches(regex);
        if (match) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
}
