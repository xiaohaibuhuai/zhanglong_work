package exception01;

import java.io.FileNotFoundException;

/**
 * 异常的处理方式2:
      try...catch

      格式:
        try{
           可能出现异常的代码
        }catch(异常对象 变量名){
           处理异常的代码-->直接将异常对象打印出来了
        }

       一旦捕获到异常了,那么下面的代码继续执行

       catch里面的异常对象要和我们抛过来的异常对象要一致或者是他的父类异常对象
 * @author zhanglong
 *
 */
public class Demo05_Exception {
	public static void main(String[] args) {
        /*try{
            String s = null;
            System.out.println(s.length());
            method(0);
        }catch (Exception e){
            System.out.println(e);
        }*/


        System.out.println("game over");

    }

    public static void method(int n)throws FileNotFoundException{
        if (n==0){
            //创建一个异常对象
            throw new FileNotFoundException();
        }

        System.out.println("我要执行了~~~");
    }
}
