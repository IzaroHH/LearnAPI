package string;

/**
 * 字符串常量池是JVM在堆内存中专门为了字符串提供的一段空间，用于缓存所有使用字面量形式
 * 创建的字符串对象，当再次使用相同字面量创建字符串时会直接重用常量池中的对象而不会再次
 * 创建新对象减少内存开销。
 *
 * @author Izaro
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        System.out.println("s1:" + s1);
        String s2 = "123abc";
        System.out.println("s2:" + s2);
        System.out.println(s1 == s2);

        String s3 = new String("123abc");
        System.out.println("s3:" + s3);
        System.out.println(s2 == s3);


        System.out.println(s2.equals(s3));

        s1 = s1 + "!";
        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);
        System.out.println(s1==s2);

        String s4="123"+"abc";
        System.out.println("s4:"+s4);
        System.out.println(s4==s2);
        System.out.println(s4==s3);
    }

}
