package string;

/**
 * @Author: Izaro
 * @Date: 2021/1/22 16:54
 * String toLowerCase()
 * <p>
 * 将当前字符串中的英文部分转换为全小写
 * String toUpperCase()
 * 将当前字符串中的英文部分转换为全大写
 */
public class ToUpperCaseDemo {
    public static void main(String[] args) {
        String str = "我爱Java";
        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();
        System.out.println(str1 + "---" + str2);

        String code = "Ae3Gh";
        String input = "ae3gh";
        code = code.toLowerCase();
        input = input.toLowerCase();
        if (code.equals(input)) {
            System.out.println("通过");
        } else {
            System.out.println("不通过");
        }
    }
}
