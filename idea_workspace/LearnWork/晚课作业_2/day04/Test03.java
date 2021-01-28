package day04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 用户登录功能
 * 程序启动后，要求用户输入用户名和密码
 * 然后去user.dat文件中比对
 * 成功则输出:登录成功
 * 失败则输出:登录失败，用户名或密码不正确
 * <p>
 * 登录失败的条件:用户名输入正确但是密码不正确，或者用户名
 * 输入不正确(user.dat文件中没有此人)
 *
 * @author Xiloer
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        RandomAccessFile a1 = new RandomAccessFile("user.dat", "rw");
        for (int i = 0; i < a1.length(); i++) {
            byte[] data = new byte[32];
            a1.read(data);
            String username1 = new String(data, "UTF-8").trim();
            a1.read(data);
            String password1 = new String(data, "UTF-8").trim();
            if (username.equals(username1) && password.equals(password1)) {
                System.out.println("登陆成功");
                break;
            } else {
                a1.seek(i * 100 + 100);
            }
            while (i == a1.length() / 100 - 1) {
                if (!username.equals(username1)) {
                    System.out.println("查无此人");
                    break;
                } else {
                    System.out.println("登陆失败，密码不正确");
                    break;
                }
            }
        }
    }
}
