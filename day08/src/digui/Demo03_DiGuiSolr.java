package digui;

import java.io.File;

/**
 * 递归获取文件夹下所有文件
            获取指定的文件下所有的文件或者文件夹,如果是文件,直接输出;如果是文件夹
               再获取该文件夹下所有的文件或者文件夹如果是文件,直接输出;如果是文件夹
                    再获取该文件夹下所有的文件或者文件夹如果是文件,直接输出;如果是文件夹.....



    获取指定目录下所有的java文件
 * @author zhanglong
 *
 */
public class Demo03_DiGuiSolr {
	public static void main(String[] args) {
        File file = new File("E:\\传智播客\\教学班级\\北京金燕龙黑马JavaEE就业344期\\教学\\day05");
        method(file);
    }

    public static void method(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                /*System.out.println(file1);*/
                String name = file1.getName();
                if (name.toLowerCase().endsWith(".java")){
                    System.out.println(file1.getAbsolutePath());
                }
                //System.out.println(name);
            }else{
                method(file1);
            }
        }
                
    }
}
