package file02;

import java.io.File;

/**
 * 获取指定路径下所有的内容
         public String[] list():返回一个String数组，表示该File目录中的所有子文件或目录
         public File[] listFiles():获取指定文件夹下的所有子文件或目录
 * @author zhanglong
 *
 */
public class Demo06_ForEachFile {
	public static void main(String[] args) {
        //创建对象
        File file = new File("F:\\idea\\work");
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }

    }
}
