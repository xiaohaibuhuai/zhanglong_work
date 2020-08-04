package file02;

import java.io.File;

/**
 * File类中的获取功能:
      public String getAbsolutePath() ：返回此File的绝对路径名字符串。
      public String getPath() ：将此File转换为路径名字符串。
      public String getName()  ：返回由此File表示的文件或目录的名称。
      public long length()  ：返回由此File表示的文件的长度。

      File getAbsoluteFile():返回的是绝对路径的File对象

 * @author zhanglong
 *
 */
public class Demo05_Get {
	  public static void main(String[] args) {
	        //public long length()  ：返回由此File表示的文件的长度。
	        File file = new File("F:\\idea\\work\\1.txt");
	        //System.out.println(file.length());

	        //public String getAbsolutePath() ：返回此File的绝对路径名字符串。

	        File file1 = new File("day08\\c.txt");
	        String absolutePath = file1.getAbsolutePath();
	        System.out.println(absolutePath);

	        //public String getPath() ：创建File对象的时候,写什么路径就获取什么路径

	        File file2 = new File("day08\\c.txt");
	        System.out.println(file2.getPath());

	        //public String getName()  ：返回由此File表示的文件或目录的名称。
	        File file3 = new File("day08\\c.txt");
	        System.out.println(file3.getName());


	        File absoluteFile = file3.getAbsoluteFile();
	        System.out.println(absoluteFile);
	    }
}
