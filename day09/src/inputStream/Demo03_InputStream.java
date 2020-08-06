package inputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件复制
 * @author zhanglong
 *
 */
public class Demo03_InputStream {
	public static void main(String[] args)throws IOException {
        //数据源
        String src = "D:\\SoftExe\\小文本\\激活工具.exe";
        //定义一个目的地
        String dest = "F:\\idea\\work\\激活工具.exe";

        long start = System.currentTimeMillis();
        //copyFile01(src,dest);//6403
        copyFile02(src,dest);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void copyFile02(String src, String dest)throws IOException  {
        //创建文件字节输入流
        FileInputStream fis = new FileInputStream(src);
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] bytes = new byte[1024];

        int len = 0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }

    }

    public static void copyFile01(String src, String dest)throws IOException {
        //创建文件字节输入流
        FileInputStream fis = new FileInputStream(src);
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream(dest);

        //一个字节一个字节的复制
        int len = 0;
        while((len=fis.read())!=-1){
            //写数据
            fos.write(len);
        }

        //关流
        fos.close();
        fis.close();

    }
}
