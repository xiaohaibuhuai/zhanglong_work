package file02;

import java.io.File;
import java.io.IOException;

/**
 * File类创建方法:
      boolean createNewFile():根据执行的路径创建文件
              如果我们指定路径下的文件存在,返回false;相反,返回true

     boolean mkdir():创建单级文件夹
              如果我们指定路径下的文件夹存在,返回false;相反,返回true

     boolean mkdirs():创建多级文件夹
 * @author zhanglong
 *
 */
public class Demo02_FileCreate {
	public static void main(String[] args) throws IOException {
        //createFile();
        createDirectory();
        //createDirectorys();
    }

    private static void createDirectorys() {
        File file = new File("F:\\idea\\work\\taoge1\\a\\b");
        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);

    }

    private static void createDirectory() {
        File file = new File("F:\\idea\\work\\taoge2.txt");
        boolean mkdir = file.mkdir();
        System.out.println(mkdir);
    }

    public static void createFile() throws IOException {
        File file = new File("F:\\idea\\work\\2");
        boolean newFile = file.createNewFile();

        System.out.println(newFile);
    }
}
