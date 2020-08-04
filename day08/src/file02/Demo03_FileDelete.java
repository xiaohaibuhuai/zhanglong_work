package file02;

import java.io.File;

/**
 * File类中的删除功能:java删除,不走回收站
       boolean delete():可以删除文件和文件夹

           文件:有文件返回true,没有返回false

           文件夹:如果是空文件夹,删除返回true
                 如果不是空文件夹(有文件,或者文件夹),删除返回false

 * @author zhanglong
 *
 */
public class Demo03_FileDelete {
	public static void main(String[] args) {
	       //deleteFile();
	        deleteDirectory();
	    }

	    public static void deleteFile(){
	        File file = new File("F:\\idea\\work\\1.txt");
	        boolean delete = file.delete();
	        System.out.println(delete);
	    }

	    public static void deleteDirectory(){
	        File file = new File("F:\\idea\\work\\taoge1");
	        boolean delete = file.delete();
	        System.out.println(delete);
	    }
}
