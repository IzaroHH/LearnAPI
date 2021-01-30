package io;

import java.io.Serializable;
import java.util.Arrays;

/**
 * 使用当前类测试对象流的对象读写操作
 * <p>
 * 当一个类的实例希望被对象流进行读写时,该类必须实现接口:
 * <p>
 * java.io.Serializable
 * <p>
 * Serializable接口中没有任何抽象方法,这是一个签名接口,该接口是
 * <p>
 * 编译器敏感的结构,当编译器编译一个类时如果这个类实现了序列化接口
 * <p>
 * 则会在编译后的class文件中添加一个方法,作用是按照该类型结构转换
 * <p>
 * 为一组字节(对象流就是依靠这个方法做对象序列化的)
 *
 * @Author Izaro
 * @Date 2021/1/28 15:47
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String gender;
    /**
     * transient关键字可以在对象序列化时忽略该属性的值
     * <p>
     * 忽略不重要的属性可以达到对象序列化时的瘦身操作,减少资源开销
     */
    private transient String[] otherInfo;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    /**
     * 当一个方法使用throws声明异常抛出时,调用该方法的代码就必须处理这个异常.
     * @param age
     */
    public void setAge(int age) {
        if(age<0||age>=100){
            //超过合理范围则对外抛出一个异常
            //throw new RuntimeException("年龄不合法");
            /*
            当一个方法中使用throw抛出一个异常时,就要求在
            当前方法上使用throws声明该异常的抛出.只有
            RuntimeException是个例外
             */
            throw new RuntimeException("年龄不合法");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String[] getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String[] otherInfo) {
        this.otherInfo = otherInfo;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", otherInfo=" + Arrays.toString(otherInfo) +
                '}';
    }

    public Person(String name, int age, String gender, String[] otherInfo) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.otherInfo = otherInfo;


    }
}
