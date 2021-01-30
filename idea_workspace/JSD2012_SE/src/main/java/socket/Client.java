package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 聊天室客户端
 *
 * @Author Izaro
 * @Date 2021/1/30 14:44
 */
public class Client {
    private Socket socket;

    /**
     * 构造方法,用来初始化客户端
     */
    public Client() {
        try {
            /*
              java.net.Socket 套接字
              Socket封装了TCP协议的通讯细节,使用它可以和远端
              计算建立连接,并通过它获取一个输入流和一个输出流,
              使用者两个流的读写数据完成与远端计算机的交互,

              实例化Socket时需要传入两个参数:
              1:服务端的地址信息(IP地址)
              用过地址可以找到网络上服务端的计算
              2:服务端打开的服务端口
              通过这个端口可以找到服务端计算器运行的服务端应用程序
             */
            System.out.println("正在连接服务器...");
            //localhost表示本机IP
            //实例化的过程就是连接的过程,若连接服务端会抛出异常
            socket = new Socket("176.212.28.143", 8088);
            System.out.println("与服务端建立连接!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 客户端开始工作的方法
     */
    public void start() {
        try {
            /*
            Socket提供的方法
            OutputStream getOutputStream()
            该方法会返回一个字节输出流,通过这个输出流写出的字节
            会通过网络发送给远端计算机
             */
            OutputStream out=socket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
