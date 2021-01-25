package string;

/**
 * @Author: Izaro
 * @Date: 2021/1/25 15:49
 * String支持正则表达式三：
 *
 * String replaceAll(String regex,String str)
 * 将当前字符串中满足正则表达式的部分替换为指定内容
 */
public class replaceAllDemo {
    public static void main(String[] args) {
        String str="abc12345sdfs13141sdefa12341asfa";
        String str1=str.replaceAll("[0-9]+","#dasdasdad");
        System.out.println(str);
        str=str.replaceAll("[0-9]+","");
        System.out.println(str);

        String regex="(wqnmlgb|dsb|djb|mdzz|nmsl|草)";
        String message="dsb,你就是个mdzz nmsl 草";
        message=message.replaceAll(regex,"**");
        System.out.println(message);
    }

}
