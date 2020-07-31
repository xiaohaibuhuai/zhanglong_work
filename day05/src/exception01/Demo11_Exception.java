package exception01;

import java.io.FileNotFoundException;

/**
 * public void printStackTrace():打印异常的详细信息。

   public String getMessage():简短的信息

   public String toString():异常名字+简短信息

 * @author zhanglong
 *
 */
public class Demo11_Exception {
	public static void main(String[] args)  {
        try {
            method(0);
        } catch (FileNotFoundException e) {
            //System.out.println(e.toString());
            //System.out.println(e.getMessage());
            e.printStackTrace();

        }
    }

    public static void method(int n)throws FileNotFoundException{
        if (n==0){
            throw new FileNotFoundException("文件找不到");
        }
    }
}
