package upload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * 文件上传服务端的步骤
     1.创建ServerSocket对象,指定端口号
     2.调用accept方法等待客户端的连接,并获取连接到的客户端
     3.创建FileOutputStream对象,指定写入的地址
     4.调用getInputStream来获取客户端写过来的数据(图片)
     5.边读边写
     6.调用getOutputStream方法,往客户端响应数据(上传成功)
     7.关流
 * @author zhanglong
 *
 */
public class UploadServer {
	  public static void main(String[] args) throws IOException {
//        1.创建ServerSocket对象,指定端口号
        ServerSocket ss = new ServerSocket(9999);

        while(true){
            //2.调用accept方法等待客户端的连接,并获取连接到的客户端
            Socket socket = ss.accept();

            InetAddress inetAddress = socket.getInetAddress();
            System.out.println(inetAddress);
            new Thread(()->{

                try{
                    String fileName = System.currentTimeMillis()+new Random().nextInt(99999)+".jpg";

//        3.创建FileOutputStream对象,指定写入的地址
                    FileOutputStream fos = new FileOutputStream("F:\\idea\\work\\upload\\"+fileName);
//        4.调用getInputStream来获取客户端写过来的数据(图片)
                    InputStream is = socket.getInputStream();
//        5.边读边写
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while((len=is.read(bytes))!=-1){
                        fos.write(bytes,0,len);
                    }

                    System.out.println("-------我要响应客户端的数据--------");
//        6.调用getOutputStream方法,往客户端响应数据(上传成功)

                    OutputStream os = socket.getOutputStream();
                    os.write("上传成功".getBytes());
//        7.关流
                    os.close();
                    is.close();
                    fos.close();
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }).start();


        }
    }
}
