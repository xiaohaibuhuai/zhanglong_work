package buffered;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * 字符出入缓冲流(高效字符输入流)

       BufferedReader extends Reader

       读一个字符  读一个字符数组

       构造:
          BufferedReader(Reader r)

          Reader是字符输入流 的父类,所以传递的时候需要传递FileReader


       特殊方法:一次读一行
           String readLine()


       String s = ""
       String s = "null"
       String s = null
 * @author zhanglong
 *
 */
public class Demo04_BufferedReader {
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("day10\\b.txt"));
        /*String s = br.readLine();
        System.out.println(s);

        String s1 = br.readLine();
        System.out.println(s1);

        String s2 = br.readLine();
        System.out.println(s2);

        String s3 = br.readLine();
        System.out.println(s3);

        String s4 = br.readLine();
        System.out.println(s4);*/

        System.out.println("---------------------");

        String line = null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }

        br.close();

    }
}
