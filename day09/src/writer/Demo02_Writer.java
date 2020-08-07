package writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流: Writer

     FileWriter

     追加使用到的构造方法:默认不写是false,写了true就追加
        FileWriter(File file, boolean append)
        FileWriter(String fileName, boolean append)


   注意:
      字符输出流自带一个缓冲区,当我们写的时候,写的数据会再缓冲区中出现,如果我们想要将缓冲区中的数据
      写到文件中,那么我们就得将缓冲区中的数据刷出来



      刷数据: flush():


      flush和close的区别:
         flush:是刷新的意思,该流还可以继续用
         close:先刷新,再关流,之后该流不能用了
 * @author zhanglong
 *
 */
public class Demo02_Writer {
	public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("day09\\2.txt",true);

        fw.write("涛哥最帅");
        //fw.write("\r\n");换行
        fw.close();
        fw.flush();
        fw.write("宝瑞是世界上最单纯的人");
        fw.flush();
    }
}
