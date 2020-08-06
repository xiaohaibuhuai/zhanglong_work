package inputStream;

import java.io.FileInputStream;

/**
 * 字节输入流:读
      父类:InputStream

      子类: FileInputStream extends InputStream

      方法:
        int read()-->一次读一个字节
        int read​(byte[] b)-->一次读一个字节数组
        int read​(byte[] b, int off, int len)

       构造方法:
          FileInputStream​(File file)
          FileInputStream​(String path)
 * @author zhanglong
 *
 */
public class Demo01_InputStream {
	public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("F:\\idea\\work\\1.txt");

        //读
       /* int read = fis.read();
        System.out.println(read);

        int read1 = fis.read();
        System.out.println(read1);

        int read2 = fis.read();
        System.out.println(read2);

        int read3 = fis.read();
        System.out.println(read3);

        int read4 = fis.read();
        System.out.println(read4);*/

        System.out.println("---------abc---------");

        /*while(fis.read()!=-1){
            System.out.println(fis.read());
        }*/

        int len = 0;
        while((len=fis.read())!=-1){
            System.out.println((char)len);
        }

        fis.close();
    }
}
