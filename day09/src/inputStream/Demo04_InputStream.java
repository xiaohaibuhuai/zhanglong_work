package inputStream;

import java.io.FileInputStream;
import java.util.Arrays;

/**
 * 字节流读取中文的问题

        GBK:存储中文  一个中国字:两个字节
            你   -1,-2

        utf-8:存储中文   一个中国字:3个字节

            你:  -100,-200,-250

    每一个字符对应的字节,我们程序是看不懂的-->复制,不看读取的内容  不能边读边看

    而我们将字节转成的字符,我们程序员是能看懂的



     字符流:将文件中的内容看成一个一个的字符


     字节流:操作字节
     字符流:操作字符
 * @author zhanglong
 *
 */
public class Demo04_InputStream {
	public static void main(String[] args)throws Exception {
        FileInputStream fis = new FileInputStream("day09\\1.txt");
      /*  int len = 0;
        while((len=fis.read())!=-1){
            System.out.println(len);
        }*/

       /* int read = fis.read();
        System.out.println(read);*/

       byte[] bytes = new byte[3];  //{230,136,145}

       int len = 0;
       while((len=fis.read(bytes))!=-1){
           System.out.println(Arrays.toString(bytes));
       }
        fis.close();
    }
}
