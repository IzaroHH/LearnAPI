package day01;

/**
 * 修改下面代码的错误
 * <p>
 * 下面代码完成的功能是输出字符串中的每一个字符
 *
 * @author Xiloer
 */
public class Test03 {
    public static void main(String[] args) {
        String str = "hello world! i love java!";
        int len=str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}






