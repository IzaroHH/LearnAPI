package io;

import java.io.*;

/**
 * 将Person对象写入文件
 *
 * @Author Izaro
 * @Date 2021/1/28 16:18
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"是一名演员", "来自岛国", "促进中日文化交流", "启蒙老师"};
        Person person = new Person(name, age, gender, otherInfo);

        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        /**
         对象输出流提供了一个独有的方法:
         void writeObject(Object obj)
         该方法可以将给定的对象按照其结构转化为一组字节后写出.
         需要注意,该方法要求写出的对象必须实现了序列化结构,
         否则会抛出异常:java.io.NotSerializableException
         */
        oos.writeObject(person);
        System.out.println("对象写出完毕!");
        oos.close();
    }
}
