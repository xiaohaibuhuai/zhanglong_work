package buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出缓冲流使用(高效字符输出流)

        BufferedWriter extends Writer

        写一个字符  写一个字符数组   写字符串


        构造:

        BufferedWriter(Writer w)

        Writer是字符输出流的父类,所以传递的时候是他的子类:FileWriter

     特有方法:
         换行:newLine()
 * @author zhanglong
 *
 */
public class Demo03_BufferedWriter {
	public static void main(String[] args) throws IOException {
        //创建高效字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\b.txt"));

        bw.write("helloworld");
        bw.newLine();
        bw.write("taoge");
        bw.newLine();
        bw.write("zhonglang");
        bw.newLine();
        bw.write("baorui");
        bw.flush();
    }
}
