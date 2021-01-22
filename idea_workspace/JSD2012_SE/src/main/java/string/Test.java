package string;

/**
 * @Author: Izaro
 * @Date: 2021/1/22 16:10
 */
public class Test {
    public static void main(String[] args) {
        String s1=getHostName("www.tedu.cn");
        String s2=getHostName("http://www.tarena.com");
        String s3=getHostName("doc.canglaoshi.com.cn");
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
    }

    /**
     *获取给定的网址中的域名（地址中第一个"."到第二个"."之间的内容）
     */
    public static String getHostName(String address){
        int index=address.indexOf(".");
        int index1=address.indexOf(".",index+1);
        return address.substring(index+1,index1);
    }
}
