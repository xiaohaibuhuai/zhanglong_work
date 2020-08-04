package file02;

import java.io.File;

/**
 * File的构造方法
       File(File parent, String child)
          根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
       File(String pathname)
          通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
       File(String parent, String child)
          根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
 * @author zhanglong
 *
 */
public class Demo01_File {
	public static void main(String[] args) {
        //File(String pathname)
        File file = new File("F:\\idea\\work\\b.txt");
        System.out.println(file);

        // File(String parent, String child)
        File file1 = new File("F:\\idea\\work","c.txt");
        System.out.println(file1);

        //File(File parent, String child)
        File file3 = new File("F:\\idea\\work");
        File file4 = new File(file3,"1.txt");
        System.out.println(file4);
    }
}
