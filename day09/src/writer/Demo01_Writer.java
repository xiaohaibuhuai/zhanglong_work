package writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流: Writer

     FileWriter

     构造:
        FileWriter(File file)： 创建一个新的 FileWriter，给定要读取的File对象。
        FileWriter(String fileName)： 创建一个新的 FileWriter，给定要读取的文件的名称。

     方法:
        write(int b) 方法，每次可以写出一个字符数据
        write(char[] cbuf)
        write(char[] cbuf, int off, int len)
 * @author zhanglong
 *
 */
public class Demo01_Writer {
	public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("day09\\2.txt");
        //fw.write(97);

       /* char[] chars = {'a','b','c','d'};
        fw.write(chars,0,2);*/

        fw.write("涛哥");
        fw.close();
    }
}
