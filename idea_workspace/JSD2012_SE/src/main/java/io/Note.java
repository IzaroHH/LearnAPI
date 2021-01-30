package io;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本功能
 * <p>
 * 程序启动后要求用户输入文件名,然后对文件进行写操作.
 * <p>
 * 之后用户输入的每一行字符串都要按行写入到文件中.
 * <p>
 * 当用户单独输入exit时程序退出.
 * <p>
 * <p>
 * 要求:创建PrintWriter并且自行创建流连接完成.
 *
 * @Author Izaro
 * @Date 2021/1/29 11:16
 */
public class Note {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入文件名:");
        String filename = sc.nextLine();
        FileOutputStream fos = new FileOutputStream(filename + ".txt",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);
        //当创建PW时第一个参数为流,则可以再传入一个boolean型的参数
        //如果这个值为true,则当前PW具有自动行刷新功能.即:
        //每当我们调用println方法后会自动flush
        System.out.println("请输入内容(exit退出):");
        while (true) {
            String pw1 = sc.nextLine();
            if ("exit".equals(pw1)) {
                System.out.println("程序退出");
                break;
            }
            pw.println(pw1);
        }
        pw.close();
    }
}

