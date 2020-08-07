package writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * io异常处理

    JDK7版本的新特性(try..catch)
        不用我们手动关流,关流的动作完全不用操心,自动关
 * @author zhanglong
 *
 */
public class Demo03_Writer {
	public static void main(String[] args) {
        //try01();
       try02();

    }

    public static void try02() {
        try ( FileWriter fw = new FileWriter("day09\\2.txt");){
            fw.write("涛哥最帅");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void try01() {
        FileWriter fw = null;
        try{
            fw  = new FileWriter("day09\\2.txt");

            fw.write("涛哥最帅");


        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (fw!=null){
                    fw.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
