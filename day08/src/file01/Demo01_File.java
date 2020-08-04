package file01;

import java.io.File;

/**
 * File类的静态常量
      static String pathSeparator:与系统有关的路径分隔符
      static String separator:与系统有关的默认名称分隔符

      \在java中有特殊的含义-->转义字符
 * @author zhanglong
 *
 */
public class Demo01_File {
	public static void main(String[] args) {
        String s = "F:\\idea\\work\\1.txt";
        System.out.println(s);
        //char c = '\'';
        System.out.println(File.pathSeparator);//;
        System.out.println(File.separator);   //   \   /

        String s1 = "F:"+File.separator+"idea"+File.separator+"work"+File.separator+"1.txt";
        System.out.println(s1);
    }
}
