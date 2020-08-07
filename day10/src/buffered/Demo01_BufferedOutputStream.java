package buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * BufferedOutputStream extends OutputStream

       写一个字节   写一个字节数组    "".getBytes()


    构造:
        BufferedOutputStream(OutputStream o)

        OutputStream是字节输出流的超类,所以传递他的子类:FileOutputStream

    注意:
        高效流:自带缓冲区

    作用:为了提高效率

 * @author zhanglong
 *
 */
public class Demo01_BufferedOutputStream {
	public static void main(String[] args) throws Exception {
        //创建高效字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("day10\\a.txt"));

        //写数据
        bos.write(100);

        bos.write("helloworld".getBytes());

        bos.close();
    }
}
