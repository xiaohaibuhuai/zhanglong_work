package print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * 打印流

    PrintStream extends OutputStream

    构造:
       PrintStream(OutputStream out)
       PrintStream(String fileName)
       PrintStream(File file)


    方法:原样输出
       println()-->打印之后换行
       print()-->打印之后不换行


    方法:控制打印流的流向
         setOut()-->System

 * @author zhanglong
 *
 */
public class Demo01_PrintStream {
	public static void main(String[] args) throws Exception {
        //method01();
        method02();
    }

    public static void method02()throws Exception {
        System.out.println("涛哥是世界上最帅的人");
        PrintStream ps = new PrintStream("day10\\ps1.txt");
        System.setOut(ps);
        System.out.println("保华是世界上第二帅的人");
        System.out.println("中浪是世界上.....");
        System.out.println("孝艳是世界上最美的人");

        ps.close();
    }

    public static void method01() throws FileNotFoundException {
        PrintStream ps = new PrintStream("day10\\ps.txt");
        System.out.println("aaaaa");
        ps.println("hahah");
        ps.println(true);
        ps.close();
    }
}
