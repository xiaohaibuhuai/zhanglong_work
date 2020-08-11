package tongxin;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端

      Socket:代表的是客户端的对象
         构造:
            Socket(String ip,int port)

               ip:你要连接哪个服务器的ip
               port:指的是端口号

      步骤:
          1.创建Socket对象,指定ip以及端口号
          2.调用getOutputStream方法获取输出流
          3.利用获取的输出流去调用write方法,往服务器写数据
          4.调用getInputStream方法去获取服务器端响应回来的数据
          5.调用read方法,读取
          6.关闭资源
 * @author zhanglong
 *
 */
public class TCPClient {
	public static void main(String[] args) throws IOException {
        //1.创建Socket对象,指定ip以及端口号
        Socket socket = new Socket("127.0.0.1", 6666);

//        2.调用getOutputStream方法获取输出流
        OutputStream os = socket.getOutputStream();
//        3.利用获取的输出流去调用write方法,往服务器写数据
        os.write("你好".getBytes());
//        4.调用getInputStream方法去获取服务器端响应回来的数据
        InputStream is = socket.getInputStream();
//        5.调用read方法,读取
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
//        6.关闭资源
        is.close();
        os.close();
        socket.close();
    }
}
