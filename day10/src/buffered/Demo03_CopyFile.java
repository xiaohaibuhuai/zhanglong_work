package buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 四种复制文件方式的效率对比

      普通流字节数组读取:749


      高效流一个字节一个字节的复制:2337


      高效流一个字节数组的复制:163
 * @author zhanglong
 *
 */
public class Demo03_CopyFile {
	public static void main(String[] args) throws IOException {
        //数据源
        String src = "E:\\传智播客\\教学班级\\北京金燕龙黑马JavaEE就业344期\\教学\\day01\\视频\\03.Object类的toString方法.avi";
        //定义一个目的地
        String dest = "F:\\idea\\work\\03.Object类的toString方法.avi";

        long start = System.currentTimeMillis();
        //copyFile01(src,dest);
        //copyFile02(src,dest);

        //copyFile03Buffered(src,dest);

        copyFile04Buffered(src,dest);

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void copyFile02(String src, String dest)throws IOException {
        //创建文件字节输入流
        FileInputStream fis = new FileInputStream(src);
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] bytes = new byte[1024];

        int len = 0;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
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

    public static void copyFile03Buffered(String src, String dest) throws IOException{
        //创建文件字节输入流
        FileInputStream fis = new FileInputStream(src);
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream(dest);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //一个字节一个字节的复制
        int len = 0;
        while((len=bis.read())!=-1){
            //写数据
            bos.write(len);
        }

        //关流
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }


    public static void copyFile04Buffered(String src, String dest) throws IOException{
        //创建文件字节输入流
        FileInputStream fis = new FileInputStream(src);
        //创建文件字节输出流
        FileOutputStream fos = new FileOutputStream(dest);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] bytes = new byte[1024];

        int len = 0;
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }


        //关流
        bos.close();
        bis.close();
        fos.close();
        fis.close();
    }
}
