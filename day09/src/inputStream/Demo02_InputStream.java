package inputStream;

import java.io.FileInputStream;

/**
 * 字节输入流:读
      父类:InputStream

      子类: FileInputStream extends InputStream

      方法:
        int read()-->一次读一个字节
        int read​(byte[] b)-->一次读一个字节数组 -->字节数组就是为了存储读回来的数据
        int read​(byte[] b, int off, int len)

       构造方法:
          FileInputStream​(File file)
 * @author zhanglong
 *
 */
public class Demo02_InputStream {
	public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("F:\\idea\\work\\1.txt");
        byte[] bytes = new byte[1024];

       /* int len = fis.read(bytes);
        System.out.println(new String(bytes));
        System.out.println(len);

        int len1 = fis.read(bytes);
        System.out.println(new String(bytes));
        System.out.println(len1);

        int len2 = fis.read(bytes);
        System.out.println(new String(bytes));
        System.out.println(len2);

        int len3 = fis.read(bytes);
        System.out.println(new String(bytes));
        System.out.println(len3);*/

       int len = 0;
       while((len=fis.read(bytes))!=-1){
           System.out.println(new String(bytes,0,len));
       }

       fis.close();
    }
}
