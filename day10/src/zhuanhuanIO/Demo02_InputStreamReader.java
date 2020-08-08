package zhuanhuanIO;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * InputStreamReader:读数据

  InputStreamReader extends Reader

  构造:
     InputStreamReader(InputStream in)
     InputStreamReader(InputStream in, Charset cs) -->指定编码去读数据
 * @author zhanglong
 *
 */
public class Demo02_InputStreamReader {
	public static void main(String[] args)throws Exception {

        readGBK();
    }

    public static void readGBK()throws Exception{
        FileInputStream fis = new FileInputStream("F:\\idea\\work\\4.txt");
        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        char[] chars = new char[1024];
        int len = 0;
        while((len=isr.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }

        isr.close();
        fis.close();
    }
}
