package tongxin;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端

     ServerSocket:代表的是服务端对象
        构造方法:
            ServerSocket(int port)

        方法:
          Socket accept()-->等着客户端连接,如果连接上了,马上接受该客户端对象

    步骤:
       1.创建服务端对象,指定端口号
       2.调用accept方法去接受连接我的客户端对象
       3.调用getInputStream方法获取字节输入流对象
       4.读取客户端发来的数据
       5.调用getOutputStream方法响应给客户端数据
       6.写数据
       7.关闭资源
 * @author zhanglong
 *
 */
public class TCPServer {
	public static void main(String[] args) throws IOException {
//      1.创建服务端对象,指定端口号
      ServerSocket serverSocket = new ServerSocket(6666);
//      2.调用accept方法去接受连接我的客户端对象
      Socket s = serverSocket.accept();
      InetAddress inetAddress = s.getInetAddress();
      System.out.println(inetAddress);
//      3.调用getInputStream方法获取字节输入流对象
      InputStream is = s.getInputStream();
//      4.读取客户端发来的数据
      byte[] bytes = new byte[1024];
      int len = is.read(bytes);
      System.out.println(new String(bytes,0,len));
//      5.调用getOutputStream方法响应给客户端数据
      OutputStream os = s.getOutputStream();

//      6.写数据
      os.write("不好".getBytes());
//      7.关闭资源

      os.close();
      is.close();
      s.close();
      serverSocket.close();
  }
}
