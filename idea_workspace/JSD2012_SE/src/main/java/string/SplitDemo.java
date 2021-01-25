package string;

/**
 * String支持增则表达式方法之二：
 * <p>
 * String[]split(String regex)
 * <p>
 * 将当前字符串按照满足正则表达式的部分进行拆分，将拆分后的所有部分以
 * <p>
 * 一个String数组形式返回
 *
 * @Author: Izaro
 * @Date: 2021/1/25 11:55
 */
public class SplitDemo {
    public static void main(String[] args) {
        String str = "asdfaefawf23425sdf";
        String[] arr = str.split("[0-9]+");
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        str = "123.456.789";
        arr = str.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        str = ".123..456.789...";
        arr = str.split("\\.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
