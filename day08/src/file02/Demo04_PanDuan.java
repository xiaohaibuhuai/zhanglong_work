package file02;

import java.io.File;

/**
 * File类中的判断功能
       public boolean exists() ：此File表示的文件或目录是否实际存在。
       public boolean isDirectory() ：此File表示的是否为目录。
       public boolean isFile() ：此File表示的是否为文件。
 * @author zhanglong
 *
 */
public class Demo04_PanDuan {
	public static void main(String[] args) {
        File file = new File("F:\\idea\\work");
        boolean exists = file.exists();
        System.out.println(exists);

        boolean directory = file.isDirectory();
        System.out.println(directory);

        boolean file1 = file.isFile();
        System.out.println(file1);
    }
}
