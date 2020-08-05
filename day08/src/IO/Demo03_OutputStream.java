package IO;

import java.io.FileOutputStream;

/**
 * 写的时候内容追加

        public FileOutputStream(String name,boolean b)： 创建文件输出流以指定的名称写入文件。

        默认:false


        换行:
            \r\n
 * @author zhanglong
 *
 */
public class Demo03_OutputStream {
	public static void main(String[] args)throws Exception {
        FileOutputStream fos = new FileOutputStream("F:\\idea\\work\\test\\2.txt",true);
        /* byte[] bytes = {97,98,99};*/
        //fos.write(bytes);

        fos.write("979899".getBytes());
        fos.write("\r\n".getBytes());
        fos.close();
    }
}
