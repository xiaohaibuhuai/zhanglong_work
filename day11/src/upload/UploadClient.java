package upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 文件上传客户端代码实现

     1.创建Socket对象,指定ip  端口号
     2.创建FileInputStream,指定我们要上传的图片
     3.调用getOutputStream()获取字节输出流
     4.一边读,一边写
     5.调用getInputStream方法去获取服务端发来的"上传成功"
     6.关闭资源
 * @author zhanglong
 *
 */
public class UploadClient {
	public static void main(String[] args) throws IOException {
//	     1.创建Socket对象,指定ip  端口号
	        Socket socket = new Socket("127.0.0.1", 9999);
//	     2.创建FileInputStream,指定我们要上传的图片
	        FileInputStream fis = new FileInputStream("E:\\传智播客\\教学资料\\图片\\1.jpg");
//	     3.调用getOutputStream()获取字节输出流
	        OutputStream os = socket.getOutputStream();
//	     4.一边读,一边写
	        byte[] bytes = new byte[1024];
	        int len = 0;
	        while((len=fis.read(bytes))!=-1){
	            os.write(bytes,0,len);
	        }

	        socket.shutdownOutput();
	        System.out.println("-------我要接受服务端发来的数据--------");
//	     5.调用getInputStream方法去获取服务端发来的"上传成功"
	        //byte[] bytes1 = new byte[1024];
	        InputStream is = socket.getInputStream();
	        int len1 = is.read(bytes);
	        System.out.println(new String(bytes,0,len1));
//	     6.关闭资源

	        is.close();
	        os.close();
	        fis.close();
	        socket.close();
	    }
}
