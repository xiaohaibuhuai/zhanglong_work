package buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 文本排序练习
       1.创建高效字符输入流,读数据
       2.创建高效字符输出流,写数据
       3.创建一个list集合,保存我们读取的每一行数据
       4.Collections.sort(list)进行排序
       5.遍历List集合,一边遍历,一遍写
 * @author zhanglong
 *
 */
public class Demo05_Test {
	public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("day10\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("day10\\out.txt"));

        //创建集合
        ArrayList<String> list = new ArrayList<>();

        String line = null;
        while((line=br.readLine())!=null){
            list.add(line);
        }

       //排序
        Collections.sort(list);

        //遍历集合
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }

        //关流

        bw.close();
        br.close();
    }
}
