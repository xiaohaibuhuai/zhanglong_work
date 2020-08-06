package reader;

import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流:读取

      父类:
         Reader

      FileReader

      构造:
          FileReader(File file):根据File对象创建文件字符输入流对象
          FileReader(String fileName) :根据String创建文件字符输入流对象

      方法:
          public int read():一个字符一个字符的读
          public int read(char[] cbuf):一次读一个字符数组
 * @author zhanglong
 *
 */
public class Demo01_FileReader {
	public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("day09\\1.txt");

       /* int read = fr.read();
        System.out.println((char)read);

        int read1 = fr.read();
        System.out.println((char)read1);

        int read2 = fr.read();
        System.out.println((char)read2);

        int read3 = fr.read();
        System.out.println((char)read3);

        int read4 = fr.read();
        System.out.println((char)read4);

        int read5 = fr.read();
        System.out.println((char)read5);

        int read6 = fr.read();
        System.out.println((char)read6);

        int read7 = fr.read();
        System.out.println(read7);*/

        System.out.println("----------------");

        /*int len = 0;
        while((len=fr.read())!=-1){
            System.out.print((char)len);
        }*/


       char[] chars = new char[1024];
       int len = 0;
       while((len=fr.read(chars))!=-1){
           System.out.println(new String(chars,0,len));
       }

       //关流
        fr.close();
    }
}
