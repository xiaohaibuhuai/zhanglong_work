package web_Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 编写服务端代码

       怎么讲字节流变成字符流呢
           BufferReader(Reader r)
                       FileReader(路径)
                       InputStreamReader
                       InputStreamReader(InputStream in)

 * @author zhanglong
 *
 */
public class WebServer {
	public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        while(true){

            Socket socket = serverSocket.accept();
            new Thread(()->{
                try{
                    InputStream is = socket.getInputStream();
                    /*byte[] bytes = new byte[1024];
                    int len = is.read(bytes);
                    System.out.println(new String(bytes,0,len));*/
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String path = br.readLine().split(" ")[1].substring(1);

                    //创建FileInputStream对象
                    FileInputStream fis = new FileInputStream(path);
                    //获取输出流往浏览器端响应页面
                    OutputStream os = socket.getOutputStream();

                    os.write("HTTP/1.1 200 OK\r\n".getBytes());
                    os.write("Content-Type:text/html\r\n".getBytes());
                    os.write("\r\n".getBytes());

                    byte[] bytes = new byte[1024];
                    int len = 0;

                    while((len=fis.read(bytes))!=-1){
                        os.write(bytes,0,len);
                    }

                    //关闭资源
                    os.close();
                    fis.close();
                    br.close();
                    is.close();
                    socket.close();
                }catch (Exception e){
                    e.printStackTrace();
                }

            }).start();


        }


    }
}
