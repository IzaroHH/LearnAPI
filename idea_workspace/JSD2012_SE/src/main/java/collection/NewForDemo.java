package collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @Author Izaro
 * @Date 2021/2/4 11:36
 */
public class NewForDemo {
    public static void main(String[] args) {
        String[]arr={"one","two","three","four","five"};
        for(int i=0;i<arr.length;i++){
            String str=arr[i];
            System.out.println(str);
        }
        for(String str:arr){
            System.out.println(str);
        }


        Collection<String> c=new ArrayList<>();
        c.add("one");
        c.add("two");
        c.add("three");
        c.add("four");
        c.add("five");
        for(String str:c){
            System.out.println(str);
        }
    }
}
