package IO;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * OutputStream:
       字节输出流-->以字节的形式往硬盘上的文件中写数据

   FileOutputStream extends OutputStream


   - public FileOutputStream(File file)：创建文件输出流以写入由指定的 File对象表示的文件。
   - public FileOutputStream(String name)： 创建文件输出流以指定的名称写入文件。


   方法:
       write(int b) 方法，每次可以写出一个字节数据
       write(byte[] b)，每次可以写出数组中的数据   如果想写一个字符串,先把字符串转成byte[]数组
       write(byte[] b, int off, int len):可以写入一个字节数组的一部分
                        off:从数组哪里开始
                        len:写多少个


       close:关闭流
 * @author zhanglong
 *
 */
public class Demo02_OutputStream {
	public static void main(String[] args) throws IOException {
        method02();
        //method03();
    }

    private static void method03()throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\idea\\work\\test\\3.txt");
        byte[] bytes = {97,98,99,100,101,102};
        fos.write(bytes,1,3);
        fos.close();
    }

    public static void method02() throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\idea\\work\\test\\2.txt");
       /* byte[] bytes = {97,98,99};*/
        //fos.write(bytes);

        fos.write("helloword1".getBytes());
        fos.close();
    }

    public static void method01() throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\idea\\work\\test\\1.txt");
        fos.write(97);
        fos.write(98);
        fos.close();
    }
}
