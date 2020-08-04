package file01;
/**
 * 绝对路径和相对路径:
       绝对路径:
           带盘符的路径

       相对路径:
           不带盘符的路径


       父路径是绝对路径
       子路径是相对路径


       在java中直接写的相对路径其实是在当前的project下

 * @author zhanglong
 *
 */
public class Demo02_File {
	public static void main(String[] args) {
        String path1 = "1.txt";

        String path2 = "F:\\idea\\IdeaProjects\\344_job_code\\1.txt";
        String path3 = "F:\\idea\\IdeaProjects\\344_job_code\\day08\\c.txt";
        String path4 = "F:\\idea\\IdeaProjects\\344_job_code\\day08\\c.txt";
        String path5 = "day08\\c.txt";

    }
}
