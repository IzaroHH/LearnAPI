package exception;

import io.Person;

/**
 * 异常的抛出
 * <p>
 * throw关键字可以主动抛出一个异常.通常下列情况会主动抛出异常:
 * <p>
 * 1:当程序出现一个异常,但是该异常不应当在当前代码片段被解决时.可以抛出给调用者解决
 * <p>
 * 2.程序遇到一个满足语法但是不满足业务逻辑的情况时,可以主动创建一个对应的异常将其抛出给调用者告知这个情况.
 *
 * @Author Izaro
 * @Date 2021/1/30 9:24
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        //满足语法,但是不满足业务的情况
        /*
        当调用一个含有throws声明异常抛出的方法时,编译器要求必须处理这个异常,处理方式有两种:
        1:在当前方法上继续使用throws声明该异常地抛出给上层调用者处理
        2:使用try-catch捕获并处理这个异常
        具体使用哪种取决于异常处理的责任问题
         */
        try {
            p.setAge(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("此人年龄为:" + p.getAge());
        System.out.println("程序结束了....");
    }
}

