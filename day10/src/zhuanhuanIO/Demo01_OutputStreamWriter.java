package zhuanhuanIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 利用转换流去写数据

        OutputStreamWriter extends writer

        构造:
            OutputStreamWriter(OutputStream out, Charset cs)-->可以指定编码
            OutputStreamWriter(OutputStream out)
 * @author zhanglong
 *
 */
public class Demo01_OutputStreamWriter {
	public static void main(String[] args) throws Exception {
        //methodUTF8();
      methodGBK();
    }

    public static void methodGBK()throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\idea\\work\\4.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"gbk");
        osw.write("你");
        osw.close();
    }

    public static void methodUTF8() throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\idea\\work\\3.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
        osw.write("你");
        osw.close();
    }
}
