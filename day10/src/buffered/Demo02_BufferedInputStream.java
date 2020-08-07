package buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 高效字节输入流:读数据

      BufferedInputStream extends InputStream

         读一个字节  读一个字节数组



      构造:
          BufferedInputStream(InputStream is)

          InputStream:所有输入流的超类   传递的时候FileInputStream

 * @author zhanglong
 *
 */
public class Demo02_BufferedInputStream {
	public static void main(String[] args) throws Exception {
        //创建高效字节输入流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("day10\\a.txt"));

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }

        bis.close();
    }
}
